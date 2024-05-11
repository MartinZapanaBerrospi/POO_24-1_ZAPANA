import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class GestionEstablecimientos {
    private static final String FILENAME = "ESTABLECIMIENTOS.txt";
    private static final int RECORD_LENGTH = 100; // Tamaño total de cada registro en bytes
    private RandomAccessFile file;
    private Tools tools;

    public GestionEstablecimientos() {
        try {
            file = new RandomAccessFile("establecimientos.txt", "rw");
            tools = new Tools(); // Inicializar la instancia de la clase Tools
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ingresarEstablecimiento(Establecimiento est) {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "rw")) {
            // Validar que el ID no esté duplicado
            if (buscarEstablecimientoPorId(est.getId())) {
                System.out.println("Error: El ID ingresado ya existe para otro establecimiento.");
                return; // Salir del método si el ID está duplicado
            }

            long fileLength = file.length(); // Longitud actual del archivo
            file.seek(fileLength); // Posicionar al final del archivo

            // Si es el primer usuario, agregar el encabezado y la línea divisoria
            if (fileLength == 0) {
                file.writeBytes("ID |Descripcion                   |RUC        |Telefono  |T|UbiGeo\n");
                file.writeBytes("------------------------------------------------------------------\n");
            }

            // Escribir el nuevo registro en el archivo
            file.writeBytes(String.format("%03d|%s|%011d|%09d|%d|%s\n",
                est.getId(),
                String.format("%-30s", est.getRazonSocial()),
                est.getRUC(),
                est.getTelefono(),
                est.getTipo(),
                String.format("%-6s", est.getUbiGeo())
            ));

            System.out.println("Establecimiento ingresado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al ingresar establecimiento: " + e.getMessage());
        }
    }

    // Método para buscar un establecimiento por su ID y verificar si ya existe
    boolean buscarEstablecimientoPorId(int id) {
        boolean encontrado = false;
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "r")) {
            // Leer y descartar la línea de encabezado específica
            file.readLine(); // Leer la línea de encabezado y descartarla

            while (file.getFilePointer() < file.length()) {
                String currentLine = file.readLine(); // Leer la línea actual del archivo
                String[] parts = currentLine.split("\\|"); // Dividir la línea en partes usando el delimitador '|'
                String currentId = parts[0].trim(); // Obtener el ID de la línea actual
                if (currentId.equals(String.format("%03d", id))) { // Comparar IDs con formato 001, 002, etc.
                    encontrado = true;
                    break; // Salir del bucle si se encuentra el ID
                }
            }
        } catch (IOException e) {
            System.out.println("Error al buscar establecimiento por ID: " + e.getMessage());
        }
        return encontrado;
    }
    
    public void eliminarEstablecimiento(int idEliminar) {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "rw")) {
            // Crear un archivo temporal para almacenar los registros que no se eliminarán
            RandomAccessFile tempFile = new RandomAccessFile("temp.txt", "rw");

            // Leer y escribir el encabezado en el archivo temporal
            tempFile.writeBytes(file.readLine() + "\n");

            String currentLine;
            long filePointer = file.getFilePointer(); // Guardar la posición del puntero antes de empezar a leer
            while ((currentLine = file.readLine()) != null) {
                String[] parts = currentLine.split("\\|");
                String currentId = parts[0].trim();
                if (!currentId.equals(String.format("%03d", idEliminar))) {
                    tempFile.writeBytes(currentLine + "\n");
                } else {
                    // Si el registro actual es el que se va a eliminar, actualizar la posición del puntero
                    filePointer = file.getFilePointer();
                }
            }

            // Cerrar los archivos y eliminar el original
            file.close();
            tempFile.close();
            new java.io.File(FILENAME).delete();
            new java.io.File("temp.txt").renameTo(new java.io.File(FILENAME));

            System.out.println("Establecimiento eliminado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al eliminar establecimiento: " + e.getMessage());
        }
    }

    public void modificarEstablecimiento(int idModificar, Establecimiento nuevoEstablecimiento) {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "rw")) {
            // Crear un archivo temporal para almacenar los registros modificados
            RandomAccessFile tempFile = new RandomAccessFile("ESTABLECIMIENTOS.txt", "rw");

            // Leer y escribir el encabezado en el archivo temporal
            tempFile.writeBytes(file.readLine() + "\n");

            while (file.getFilePointer() < file.length()) {
                String currentLine = file.readLine();
                String[] parts = currentLine.split("\\|");
                String currentId = parts[0].trim();
                if (currentId.equals(String.format("%03d", idModificar))) {
                    tempFile.writeBytes(String.format("%03d|%s|%011d|%09d|%d|%s\n",
                            nuevoEstablecimiento.getId(),
                            String.format("%-30s", nuevoEstablecimiento.getRazonSocial()),
                            nuevoEstablecimiento.getRUC(),
                            nuevoEstablecimiento.getTelefono(),
                            nuevoEstablecimiento.getTipo(),
                            String.format("%-6s", nuevoEstablecimiento.getUbiGeo())
                    ));
                } else {
                    tempFile.writeBytes(currentLine + "\n");
                }
            }

            // Cerrar los archivos y reemplazar el original con el temporal
            file.close();
            tempFile.close();
            new java.io.File(FILENAME).delete();
            new java.io.File("temp.txt").renameTo(new java.io.File(FILENAME));

            System.out.println("Establecimiento modificado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al modificar establecimiento: " + e.getMessage());
        }
    }
    
    public void visualizarEstablecimientos() {
        try (RandomAccessFile file = new RandomAccessFile(FILENAME, "r")) {
            String currentLine;
            while ((currentLine = file.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.out.println("Error al visualizar establecimientos: " + e.getMessage());
        }
    }

    
    
    public static void main(String[] args) {
        GestionEstablecimientos gestion = new GestionEstablecimientos();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.println("GESTION DE ESTABLECIMIENTOS\n");
        System.out.println("-----------------------------------------");
        System.out.println("(1) Ingreso de establecimientos");
        System.out.println("(2) Eliminación de establecimientos");
        System.out.println("(3) Modificación de establecimientos");
        System.out.println("(4) Visualización de establecimientos");
        System.out.println("(5) Salir");
        System.out.println("-----------------------------------------");
        System.out.print("Seleccione opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                // Pedir datos del establecimiento
                System.out.println("Ingresar nuevo establecimiento:");
                System.out.println("-----------------------------------------");

                // Solicitar datos del nuevo establecimiento
                boolean idValido = false;
                int id = 0;
                do {
                    try {
                        System.out.print("Ingrese ID (máx. 999): ");
                        String idString = scanner.nextLine(); // Leer como cadena
                        id = Integer.parseInt(idString); // Convertir a entero

                        if (gestion.tools.validarId(String.valueOf(id))) { // Validar ID
                            if (!gestion.buscarEstablecimientoPorId(id)) { // Verificar que el ID no esté duplicado
                                idValido = true;
                            } else {
                                System.out.println("Error: El ID ingresado ya existe para otro establecimiento. Ingrese un ID válido (máx. 999).");
                            }
                        } else {
                            System.out.println("Error: El ID debe estar entre 0 y 999. Ingrese un ID válido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un ID válido (máx. 999).");
                    }
                } while (!idValido);

                if (idValido) {
                    // Solicitar datos adicionales del nuevo establecimiento
                    System.out.print("Ingrese Descripción (max 30 caracteres): ");
                    String descripcion = scanner.nextLine();
                    while (!gestion.tools.validarRazonSocial(descripcion)) {
                        System.out.print("Descripción inválida. Ingrese una descripción válida (max 30 caracteres): ");
                        descripcion = scanner.nextLine();
                    }

                    System.out.print("Ingrese RUC (11 dígitos): ");
                    String rucString = scanner.nextLine();
                    while (!gestion.tools.validarRUC(rucString)) {
                        System.out.print("RUC inválido. Ingrese un RUC válido (11 dígitos): ");
                        rucString = scanner.nextLine();
                    }
                    long ruc = Long.parseLong(rucString);

                    System.out.print("Ingrese Teléfono (9 dígitos): ");
                    String telefonoString = scanner.nextLine();
                    while (!gestion.tools.validarTelefono(telefonoString)) {
                        System.out.print("Teléfono inválido. Ingrese un teléfono válido (9 dígitos): ");
                        telefonoString = scanner.nextLine();
                    }
                    long telefono = Long.parseLong(telefonoString);

                    System.out.print("Ingrese Tipo (1 para público, 2 para privado): ");
                    String tipoString = scanner.nextLine();
                    while (!gestion.tools.validarTipo(tipoString)) {
                        System.out.print("Tipo inválido. Ingrese un tipo válido (1 para público, 2 para privado): ");
                        tipoString = scanner.nextLine();
                    }
                    int tipo = Integer.parseInt(tipoString);

                    System.out.print("Ingrese Ubicación Geográfica (6 dígitos): ");
                    String ubiGeo = scanner.nextLine();
                    while (!gestion.tools.validarUbiGeo(ubiGeo)) {
                        System.out.print("Ubicación geográfica inválida. Ingrese una ubicación válida (6 dígitos): ");
                        ubiGeo = scanner.nextLine();
                    }

                    // Crear establecimiento y guardarlo en el archivo
                    Establecimiento nuevoEstablecimiento = new Establecimiento(id, descripcion, ruc, telefono, tipo, ubiGeo);
                    gestion.ingresarEstablecimiento(nuevoEstablecimiento);
                } else {
                    System.out.println("Error: No se pudo crear el establecimiento debido a un ID inválido.");
                }

                break;
            case 2:
                System.out.println("Eliminar establecimiento:");
                System.out.println("-----------------------------------------");

                System.out.print("ID del establecimiento a eliminar: ");
                int idEliminar = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                gestion.eliminarEstablecimiento(idEliminar);
                break;
            case 3:
                System.out.println("Modificar establecimiento:");
                System.out.println("-----------------------------------------");

                System.out.print("ID del establecimiento a modificar: ");
                int idModificar = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Nueva Descripción: ");
                String nuevaDescripcion = scanner.nextLine();

                System.out.print("Nuevo RUC: ");
                long nuevoRuc = scanner.nextLong();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Nuevo Teléfono: ");
                long nuevoTelefono = scanner.nextLong();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Nuevo Tipo (1 para público, 2 para privado): ");
                int nuevoTipo = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Nueva Ubicación Geográfica: ");
                String nuevaUbiGeo = scanner.nextLine();

                Establecimiento establecimientoModificado = new Establecimiento(idModificar, nuevaDescripcion, nuevoRuc, nuevoTelefono, nuevoTipo, nuevaUbiGeo);
                gestion.modificarEstablecimiento(idModificar, establecimientoModificado);
                break;
            case 4:
                System.out.println("Visualización de establecimientos:");
                System.out.println("-----------------------------------------");
                gestion.visualizarEstablecimientos();
                break;
            case 5:
                System.out.println("Saliendo del programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
