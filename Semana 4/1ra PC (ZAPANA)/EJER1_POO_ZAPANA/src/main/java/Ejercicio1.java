
import java.util.Scanner;

public class Ejercicio1 {
    //-----------------------------------------------
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú de selección de tipo de empleado
        System.out.println("Seleccione el tipo de empleado a registrar:");
        System.out.println("1 - Personal de Salud");
        System.out.println("2 - Personal Administrativo");
        System.out.print("Ingrese el número correspondiente: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del número
        // Validar la opción ingresada por el usuario
        switch (opcion){
            case 1 -> {
                Personal_Salud personalSalud = new Personal_Salud();
                personalSalud.IngresarDatosSalud();
            }
            case 2 -> {
                Personal_Administrativo personalAdmin = new Personal_Administrativo();
                personalAdmin.IngresarDatosAdministrativo();
            }
            default -> System.out.println("Opción no válida. Por favor, ingrese 1 o 2 para seleccionar el tipo de empleado.");
        }
        scanner.close();
    
    }
    //-----------------------------------------------
}
