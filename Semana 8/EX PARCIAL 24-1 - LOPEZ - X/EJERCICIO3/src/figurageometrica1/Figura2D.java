
package figurageometrica1;

public class Figura2D extends FiguraGeometrica1 {
    protected double base;
    protected double altura;

    // Constructor
    public Figura2D(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método abstracto calcularArea para figuras 2D
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Implementación del método abstracto calcularPerimetroOVolumen para figuras 2D
    @Override
    public double calcularPerimetroOVolumen() {
        return 2 * (base + altura);
    }
}
