package BuilderEmpleado;

import Departamento.Departamento;

public interface FactoryEmpleado {
    EmpleadoPrincipal createEmpleadoPrincipal(String nombre, int edad, String departamento);

}
