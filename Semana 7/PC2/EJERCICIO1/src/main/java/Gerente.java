public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, String apellido, double salarioBase, double bono) {
        super(nombre, apellido, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }
}
