
import java.util.Scanner;

class Personal_Salud extends Persona {
    public int tipoPersonal;

    public Personal_Salud() {
        super();
        this.tipoPersonal = 1;
    }

    public void IngresarDatosSalud() {
    Scanner SCN = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Ingreso de Datos para Personal de Salud");
        System.out.println("=========================");
        IngresarDatosGenerales();
        // Agregar aquí ingreso de datos específicos para Personal de Salud si es necesario
        String especialidad;
        System.out.println("-------------------------------------------");
        System.out.print("Especialidad: ");  especialidad = SCN.nextLine();
        
    }
}
