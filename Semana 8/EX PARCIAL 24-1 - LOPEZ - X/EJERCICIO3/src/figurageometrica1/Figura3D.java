
package figurageometrica1;


public class Figura3D extends FiguraGeometrica1 {
    protected double longitud;
    protected double ancho;
    protected double altura;

    // Constructor
    public Figura3D(String nombre, double longitud, double ancho, double altura) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    // Implementación del método abstracto calcularArea para figuras 3D
    @Override
    public double calcularArea() {
        // No es aplicable para figuras 3D, devolvemos 0
        return 0;
    }

    // Implementación del método abstracto calcularPerimetroOVolumen para figuras 3D
    @Override
    public double calcularPerimetroOVolumen() {
        return longitud * ancho * altura;
    }
}
