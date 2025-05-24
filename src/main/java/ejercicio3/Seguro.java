package ejercicio3;

public abstract class Seguro {
    public static final double DESCUENTO = 0.05;
    protected double costo;
    private Tipo tipo;

    public Seguro(Tipo tipo, double costo) {
        this.costo = costo;
        this.tipo = tipo;
    }

    protected abstract double costo();

}
