package ejercicio5;

public abstract class Calculador {

    private int precioUnitario;

    public Calculador(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final double calcularPrecioFinal() {
        double precioBase = aplicarRecargos(precioUnitario);
        precioBase = aplicarBonificaciones(precioBase);
        return aplicarGanancia(precioBase);
    }

    public abstract double aplicarRecargos(double precioBase);

    public abstract double aplicarBonificaciones(double precioBase);

    public abstract double aplicarGanancia(double precioBase);
}
