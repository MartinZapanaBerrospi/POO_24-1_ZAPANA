import java.io.*;

public class UserManager {
    private static final String FILENAME = "USUARIOS.txt";
    private static final int RECORD_LENGTH = 92; // Tamaño total de cada registro en bytes

    public void ingresarUsuario(Usuario usuario) {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "rw")) {
            // Validar que el ID no esté duplicado
            if (buscarUsuarioPorId(usuario.getId())) {
                System.out.println("Error: El ID ingresado ya existe para otro usuario.");
                return; // Salir del método si el ID está duplicado
            }

            long fileLength = file.length(); // Longitud actual del archivo
            file.seek(fileLength); // Posicionar al final del archivo

            // Si es el primer usuario, agregar el encabezado y la línea divisoria
            if (fileLength == 0) {
                file.writeBytes("ID |Nombres y Apellidos           |Login     |Password  |E|Fecha de ingreso\n");
                file.writeBytes("---------------------------------------------------------------------------\n");
            }

            // Escribir el nuevo registro en el archivo
            file.writeBytes(String.format("%03d|%s|%s|%s|%d|%s\n",
                usuario.getId(),
                String.format("%-30s", usuario.getNombresApellidos()),
                String.format("%-10s", usuario.getLogin()),
                String.format("%-10s", usuario.getPassword()),
                usuario.getEstado(),
                usuario.getFechaIngreso()
            ));
            System.out.println("Usuario ingresado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al ingresar usuario: " + e.getMessage());
        }
    }

    // Método para buscar un usuario por su ID y verificar si ya existe
    boolean buscarUsuarioPorId(int id) {
        boolean encontrado = false;
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "r")) {
            // Leer y descartar la línea de encabezado específica
            file.readLine(); // Leer la línea de encabezado y descartarla

            while (file.getFilePointer() < file.length()) {
                String currentLine = file.readLine(); // Leer la línea actual del archivo
                String[] parts = currentLine.split("\\|"); // Dividir la línea en partes usando el delimitador '|'

                String currentId = parts[0].trim(); // Obtener el ID de la línea actual
                System.out.println(currentId);
                if (currentId.equals(String.format("%03d", id))) { // Comparar IDs con formato 001, 002, etc.
                    encontrado = true;
                    break; // Salir del bucle si se encuentra el ID
                }
            }
        } catch (IOException e) {
            System.out.println("Error al buscar usuario por ID: " + e.getMessage());
        }
        return encontrado;
    }


    public void eliminarUsuario(int id) {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "rw")) {
            while (file.getFilePointer() < file.length()) {
                long currentPosition = file.getFilePointer();
                int currentId = file.readInt();
                if (currentId == id) {
                    file.seek(currentPosition);
                    for (int i = 0; i < RECORD_LENGTH; i++) {
                        file.writeByte(' ');
                    }
                    break;
                }
                file.seek(currentPosition + RECORD_LENGTH);
            }
        } catch (IOException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }
    }

    public void modificarUsuario(Usuario usuario) {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "rw")) {
            while (file.getFilePointer() < file.length()) {
                long currentPosition = file.getFilePointer();
                int currentId = file.readInt();
                if (currentId == usuario.getId()) {
                    file.seek(currentPosition);
                    file.writeInt(usuario.getId());
                    writeString(file, usuario.getNombresApellidos(), 30);
                    writeString(file, usuario.getLogin(), 10);
                    writeString(file, usuario.getPassword(), 10);
                    file.writeInt(usuario.getEstado());
                    writeString(file, usuario.getFechaIngreso(), 8);
                    break;
                }
                file.seek(currentPosition + RECORD_LENGTH);
            }
        } catch (IOException e) {
            System.out.println("Error al modificar usuario: " + e.getMessage());
        }
    }

    public Usuario consultarUsuario(String id) {
    Usuario usuario = null;
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "r")) {
            while (file.getFilePointer() < file.length()) {
                String currentId = readString(file, 3); // Leer el ID como String de 3 caracteres
                if (currentId.equals(id)) {
                    String nombresApellidos = readString(file, 30);
                    String login = readString(file, 10);
                    String password = readString(file, 10);
                    int estado = file.readInt();
                    String fechaIngreso = readString(file, 8);

                    usuario = new Usuario(Integer.parseInt(id), nombresApellidos, login, password, estado, fechaIngreso);
                    // Mostrar la información del usuario en la consola
                    System.out.println("Información del usuario consultado:");
                    System.out.println(usuario.toString());
                    break;
                } else {
                    file.seek(file.getFilePointer() + RECORD_LENGTH - 4); // Saltar al siguiente registro
                }
            }
        } catch (IOException e) {
            System.out.println("Error al consultar usuario: " + e.getMessage());
        }
        return usuario;
    }

    // Método auxiliar para escribir cadenas en el archivo con el tamaño especificado
    private void writeString(RandomAccessFile file, String data, int length) throws IOException {
        if (data.length() > length) {
            file.writeBytes(data.substring(0, length));
        } else {
            file.writeBytes(data);
            for (int i = data.length(); i < length; i++) {
                file.writeByte(' ');
            }
        }
    }

    // Método auxiliar para leer cadenas del archivo con el tamaño especificado
    private String readString(RandomAccessFile file, int length) throws IOException {
        byte[] buffer = new byte[length];
        file.readFully(buffer);
        return new String(buffer).trim();
    }
}
