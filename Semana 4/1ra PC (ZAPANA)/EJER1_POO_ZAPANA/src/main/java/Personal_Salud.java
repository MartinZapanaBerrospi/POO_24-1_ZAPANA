public class Personal_Salud extends Persona {
    private String Especialidad;

    // Constructor, getters, and setters
    public Personal_Salud(String DNI, String NomApe, int Edad, String Direccion, String Telefono, String FecNac, String Especialidad) {
        super(DNI, NomApe, Edad, Direccion, Telefono, FecNac);
        this.Especialidad = Especialidad;
    }

    // Getter and setter for Especialidad
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
}

