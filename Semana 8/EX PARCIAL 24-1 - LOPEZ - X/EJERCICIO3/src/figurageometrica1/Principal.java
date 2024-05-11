
package figurageometrica1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();
        
        System.out.println("¿La figura es 2D o 3D? (Ingrese '2D' para 2D, '3D' para 3D):");
        String tipo = scanner.nextLine();
        
        if (tipo.equalsIgnoreCase("2D")) {
            System.out.println("Ingrese la base:");
            double base = scanner.nextDouble();
            
            System.out.println("Ingrese la altura:");
            double altura = scanner.nextDouble();
            
            // Crear una figura 2D (rectángulo)
            Figura2D figura2D = new Figura2D(nombre, base, altura);
            
            // Mostrar información de la figura 2D
            System.out.println("\nInformación de la figura 2D:");
            figura2D.mostrarInformacion();
        } else if (tipo.equalsIgnoreCase("3D")) {
            System.out.println("Ingrese la longitud:");
            double longitud = scanner.nextDouble();
            
            System.out.println("Ingrese el ancho:");
            double ancho = scanner.nextDouble();
            
            System.out.println("Ingrese la altura:");
            double altura = scanner.nextDouble();
            
            // Crear una figura 3D (cubo)
            Figura3D figura3D = new Figura3D(nombre, longitud, ancho, altura);
            
            // Mostrar información de la figura 3D
            System.out.println("\nInformación de la figura 3D:");
            figura3D.mostrarInformacion();
        } else {
            System.out.println("Tipo de figura inválido. Debe ser '2D' para 2D o '3D' para 3D.");
        }
        
        scanner.close();
        
    }
}
