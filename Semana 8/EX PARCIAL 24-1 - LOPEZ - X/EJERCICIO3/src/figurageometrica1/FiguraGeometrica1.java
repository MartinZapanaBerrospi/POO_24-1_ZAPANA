
package figurageometrica1;

public abstract class FiguraGeometrica1 {
protected String nombre;

    // Constructor
    public FiguraGeometrica1(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método abstracto para calcular el perímetro o volumen
    public abstract double calcularPerimetroOVolumen();

    // Método concreto para obtener el nombre de la figura
    public String getNombre() {
        return nombre;
    }

    // Método concreto para mostrar información básica de la figura
    public void mostrarInformacion() {
        System.out.println("Nombre de la figura: " + nombre);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro o volumen: " + calcularPerimetroOVolumen());
    }
    
}
