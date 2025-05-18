package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado {

    public static final String VALIDO_EMPLEADO_JERARQUICO = "Solo directores o mandos medios son empleados jarárquicos";
    public static final String VALIDO_DIRECTOR = "Como director solo mandos medios pueden estar a mi cargo.";
    public static final String VALIDO_MANDOMEDIO = "Como mando medio solo juniors pueden estar a mi cargo.";
    private final String nombre;
    private final float salario;
    private final Cargo cargo;
    private List<Empleado> empleados;

    public EmpleadoJerarquico(String nombre, float salario, Cargo cargo) {
        if (!cargo.equals(Cargo.DIRECTOR) && !cargo.equals(Cargo.MANDOMEDIO)) {
            throw new RuntimeException(VALIDO_EMPLEADO_JERARQUICO);
        }
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        this.empleados = new ArrayList<>();
    }

    @Override
    public float calcularSalario() {
        float total = this.salario;
        for (Empleado empleado : this.empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (cargo.equals(Cargo.DIRECTOR) && !empleado.cargo().equals(Cargo.MANDOMEDIO)) {
            throw new RuntimeException(VALIDO_DIRECTOR);
        }
        if (cargo.equals(Cargo.MANDOMEDIO) && !empleado.cargo().equals(Cargo.JUNIOR)) {
            throw new RuntimeException(VALIDO_MANDOMEDIO);
        }
        this.empleados.add(empleado);
    }
}
