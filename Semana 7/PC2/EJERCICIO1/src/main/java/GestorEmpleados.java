
import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados implements Contratable {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    @Override
    public void contratarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado contratado: " + empleado.getNombre() + " " + empleado.getApellido());
    }

    @Override
    public void despedirEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        System.out.println("Empleado despedido: " + empleado.getNombre() + " " + empleado.getApellido());
    }

    public void mostrarNomina() {
        System.out.println("Nómina de la empresa:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " " + empleado.getApellido() + ": " + empleado.calcularSalario());
        }
    }

    Iterable<Empleado> getEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}