
import java.util.Scanner;

class Personal_Administrativo extends Persona {
    private int tipoPersonal;

    public Personal_Administrativo() {
        super();
        this.tipoPersonal = 2;
    }

    public void IngresarDatosAdministrativo() {
        Scanner SCN = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Ingreso de Datos para Personal Administrativo");
        System.out.println("=========================");
        IngresarDatosGenerales();
        // Agregar aquí ingreso de datos específicos para Personal Administrativo si es necesario
        String Area;
        System.out.println("-------------------------------------------");
        System.out.print("Area: ");  Area = SCN.nextLine();
    }
}