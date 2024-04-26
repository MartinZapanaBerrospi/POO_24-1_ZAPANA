public class Personal_Admin extends Persona {
    private String Area;

    // Constructor, getters, and setters
    public Personal_Admin(String DNI, String NomApe, int Edad, String Direccion, String Telefono, String FecNac, String Area) {
        super(DNI, NomApe, Edad, Direccion, Telefono, FecNac);
        this.Area = Area;
    }

    // Getter and setter for Area
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
}
