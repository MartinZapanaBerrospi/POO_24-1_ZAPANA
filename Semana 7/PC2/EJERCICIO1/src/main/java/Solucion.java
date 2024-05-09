public class Solucion {
    public static void main(String[] args) {
        // Crear gestor de empleados
        GestorEmpleados gestor = new GestorEmpleados();

        // Contratar un gerente y un asistente
        Empleado gerente = new Gerente("Juan", "Perez", 5000, 1000);
        Empleado asistente = new Asistente("Maria", "Lopez", 3000);

        gestor.contratarEmpleado(gerente);
        gestor.contratarEmpleado(asistente);

        // Mostrar la nómina de la empresa
        gestor.mostrarNomina();

        // Despedir al asistente
        gestor.despedirEmpleado(asistente);

        // Mostrar la nómina actualizada
        gestor.mostrarNomina();
    }
}
