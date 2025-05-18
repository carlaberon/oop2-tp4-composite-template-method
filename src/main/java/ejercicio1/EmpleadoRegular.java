package ejercicio1;

public class EmpleadoRegular implements Empleado {

    private final String nombre;
    private final float salario;
    private final Cargo cargo;

    public EmpleadoRegular(Cargo cargo, String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public float calcularSalario() {
        return this.salario;
    }

    @Override
    public Cargo cargo() {
        return this.cargo;
    }
}
