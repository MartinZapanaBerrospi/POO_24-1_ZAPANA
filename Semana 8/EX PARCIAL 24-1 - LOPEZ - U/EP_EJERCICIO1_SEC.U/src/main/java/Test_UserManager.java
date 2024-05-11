import java.util.Scanner;

public class Test_UserManager {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Tools tools = new Tools();
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("SISTEMA DE INFORMACIÓN ABC\n");
        System.out.println("-----------------------------------------");
        System.out.println("          GESTIÓN DE USUARIOS");
        System.out.println("-----------------------------------------");
        System.out.println("1. Ingreso de usuarios");
        System.out.println("2. Eliminación de usuarios");
        System.out.println("3. Modificación de usuarios");
        System.out.println("4. Consulta de usuarios");
        System.out.println("-----------------------------------------");
        System.out.print("Seleccione opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                // Pedir datos del usuario
                System.out.println("Ingreso de usuarios");
                System.out.println("-----------------------------------------");

                // Solicitar datos del nuevo usuario
                boolean idValido = false;
                int id = 0;
                do {
                    try {
                        System.out.print("Ingrese ID (máx. 999): ");
                        String idString = scanner.nextLine(); // Leer como cadena
                        id = Integer.parseInt(idString); // Convertir a entero

                        if (id >= 0 && id <= 999) { // Verificar que el ID esté dentro del rango válido
                            if (!userManager.buscarUsuarioPorId(id)) { // Verificar que el ID no esté duplicado
                                idValido = true;
                            } else {
                                System.out.println("Error: El ID ingresado ya existe para otro usuario. Ingrese un ID válido (máx. 999).");
                            }
                        } else {
                            System.out.println("Error: El ID debe estar entre 0 y 999. Ingrese un ID válido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un ID válido (máx. 999).");
                    }
                } while (!idValido);

                if (idValido) {
                    // Solicitar datos del nuevo usuario
                    System.out.print("Ingrese nombres y apellidos (max 30 caracteres): ");
                    String nombresApellidos = scanner.nextLine();
                    while (!tools.validarNombresApellidos(nombresApellidos)) {
                        System.out.print("Nombres y apellidos inválidos. Ingrese nombres y apellidos válidos (max 30 caracteres): ");
                        nombresApellidos = scanner.nextLine();
                    }

                    System.out.print("Ingrese login (max 10 caracteres): ");
                    String login = scanner.nextLine();
                    while (!tools.validarLogin(login)) {
                        System.out.print("Login inválido. Ingrese un login válido (max 10 caracteres): ");
                        login = scanner.nextLine();
                    }

                    System.out.print("Ingrese password (max 10 caracteres): ");
                    String password = scanner.nextLine();
                    while (!tools.validarPassword(password)) {
                        System.out.print("Password inválido. Ingrese un password válido (max 10 caracteres): ");
                        password = scanner.nextLine();
                    }

                    System.out.print("Ingrese estado (0/1): ");
                    String estadoString = scanner.nextLine();
                    while (!tools.validarEstado(estadoString)) {
                        System.out.print("Estado inválido. Ingrese un estado válido (0/1): ");
                        estadoString = scanner.nextLine();
                    }
                    int estado = Integer.parseInt(estadoString);

                    System.out.print("Ingrese fecha de ingreso (DDMMYYYY): ");
                    String fechaIngreso = scanner.nextLine();
                    while (!tools.validarFechaIngreso(fechaIngreso)) {
                        System.out.print("Fecha de ingreso inválida. Ingrese una fecha válida (DDMMYYYY): ");
                        fechaIngreso = scanner.nextLine();
                    }

                    // Crear usuario y guardarlo en el archivo
                    Usuario nuevoUsuario = new Usuario(id, nombresApellidos, login, password, estado, fechaIngreso);
                    userManager.ingresarUsuario(nuevoUsuario);
                } else {
                    System.out.println("Error: No se pudo crear el usuario debido a un ID inválido.");
                }

                break;
            case 2:
                // Eliminar usuario
                System.out.print("Ingrese ID del usuario a eliminar: ");
                int idEliminar = scanner.nextInt();
                userManager.eliminarUsuario(idEliminar);
                break;
            case 3:
                // Modificar usuario
                System.out.print("Ingrese ID del usuario a modificar (max 999): ");
                String idStringModificar = scanner.nextLine();
                while (!tools.validarId(idStringModificar)) {
                    System.out.print("ID inválido. Ingrese un ID válido (max 999): ");
                    idStringModificar = scanner.nextLine();
                }
                // Consultar usuario para mostrar los datos actuales
                Usuario usuarioModificar = userManager.consultarUsuario(idStringModificar); // Cambio aquí
                if (usuarioModificar == null) {
                    System.out.println("El usuario con ID " + idStringModificar + " no existe.");
                } else {
                    System.out.println("Datos actuales del usuario:");
                    System.out.println(usuarioModificar.toString());

                    // Consulta al usuario para determinar qué campo desea modificar
                    System.out.println("¿Desea modificar un campo? (s/n)");
                    String respuesta = scanner.nextLine().toLowerCase();
                    while (respuesta.equals("s")) {
                        System.out.println("1. Nombres y Apellidos");
                        System.out.println("2. Login");
                        System.out.println("3. Password");
                        System.out.println("4. Estado");
                        System.out.println("5. Fecha de Ingreso");
                        System.out.println("6. No modificar más campos");
                        System.out.print("Seleccione el campo a modificar: ");
                        int campoModificar = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        switch (campoModificar) {
                            case 1:
                                System.out.print("Ingrese nuevos nombres y apellidos: ");
                                String nuevosNombresApellidos = scanner.nextLine();
                                if (tools.validarNombresApellidos(nuevosNombresApellidos)) {
                                    usuarioModificar.setNombresApellidos(nuevosNombresApellidos);
                                } else {
                                    System.out.println("Nombres y apellidos no válidos.");
                                }
                                break;
                            case 2:
                                System.out.print("Ingrese nuevo login: ");
                                String nuevoLogin = scanner.nextLine();
                                // Validar datos utilizando Tools.java
                                if (tools.validarLogin(nuevoLogin)) {
                                    usuarioModificar.setLogin(nuevoLogin);
                                } else {
                                    System.out.println("Login no válido.");
                                }
                                break;
                            case 3:
                                System.out.print("Ingrese nuevo password: ");
                                String nuevoPassword = scanner.nextLine();
                                // Validar datos utilizando Tools.java
                                if (tools.validarPassword(nuevoPassword)) {
                                    usuarioModificar.setPassword(nuevoPassword);
                                } else {
                                    System.out.println("Password no válido.");
                                }
                                break;
                            case 4:
                                System.out.print("Ingrese nuevo estado (0/1): ");
                                String nuevoEstado = scanner.nextLine();
                                if (tools.validarEstado(nuevoEstado)) {
                                    usuarioModificar.setEstado(Integer.parseInt(nuevoEstado)); // Convertir a entero antes de asignar
                                } else {
                                    System.out.println("Estado no válido.");
                                }
                                break;
                            case 5:
                                System.out.print("Ingrese nueva fecha de ingreso (DDMMYYYY): ");
                                String nuevaFechaIngreso = scanner.nextLine();
                                // Validar datos utilizando Tools.java
                                if (tools.validarFechaIngreso(nuevaFechaIngreso)) {
                                    usuarioModificar.setFechaIngreso(nuevaFechaIngreso);
                                } else {
                                    System.out.println("Fecha de ingreso no válida.");
                                }
                                break;
                            case 6:
                                break; // Salir del bucle si el usuario no desea modificar más campos
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                        System.out.println("¿Desea modificar otro campo? (s/n)");
                        respuesta = scanner.nextLine().toLowerCase();
                    }
                // Actualizar usuario en el archivo
                userManager.modificarUsuario(usuarioModificar);
                System.out.println("Usuario modificado correctamente.");
                }
                break;
            case 4:
                // Consultar usuario
                System.out.print("Ingrese ID del usuario a consultar (máx. 999): ");
                String idConsultar;
                while (true) {
                    idConsultar = scanner.nextLine();
                    if (tools.validarId(idConsultar)) {
                        // Convertir el ID a formato de 3 dígitos con ceros a la izquierda si es necesario
                        idConsultar = String.format("%03d", Integer.parseInt(idConsultar)); 
                        break; // Salir del bucle si el ID es válido
                    } else {
                        System.out.print("ID inválido. Ingrese un ID válido (máx. 999): ");
                    }
                }
                // Llamar a consultarUsuario con el ID en el formato correcto
                userManager.consultarUsuario(idConsultar);


                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}



