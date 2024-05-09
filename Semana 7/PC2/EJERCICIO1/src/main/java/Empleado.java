public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double salarioBase;

    public Empleado(String nombre, String apellido, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario(); // Método abstracto a ser implementado por las clases concretas
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
}
