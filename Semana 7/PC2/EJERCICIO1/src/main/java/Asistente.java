public class Asistente extends Empleado {
    public Asistente(String nombre, String apellido, double salarioBase) {
        super(nombre, apellido, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}
