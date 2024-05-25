package BuilderEmpleado;

public class EmpleadoSecundarioFactory implements FactoryEmpleado {
    @Override
    public EmpleadoPrincipal createEmpleadoPrincipal(String nombre, int edad, String departamento) {
        return new EmpleadoPrincipal(nombre, edad, "SEcundario");
    }
}
