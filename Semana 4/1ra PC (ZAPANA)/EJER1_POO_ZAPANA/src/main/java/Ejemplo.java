public class Ejemplo {
    public static void main(String[] args) {
        Personal_Salud PS = new Personal_Salud("1234567", "Martin", 18, "UNI", "987654321", "12/12/2006", "Enfermeria");
        Tools TS = new Tools();
        System.out.println(PS.Obtener_DNI());
        System.out.println(PS.Obtener_Direccion());
        System.out.println(PS.Obtener_Edad());
        TS.DNI_Ok(PS.Obtener_DNI());
    }
}
