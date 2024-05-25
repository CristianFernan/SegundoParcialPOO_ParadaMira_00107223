package BuilderEmpleado;

import Departamento.Departamento;

public class EmpleadoPrincipalFactory implements FactoryEmpleado {
    @Override
    public EmpleadoPrincipal createEmpleadoPrincipal(String nombre, int edad, String departamento) {
        return new EmpleadoPrincipal(nombre, edad, "Principal");
    }
}
