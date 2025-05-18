package ejercicio3;

public abstract class Seguro {
    private Tipo tipo;
    private double costo;

    public Seguro(Tipo tipo, double costo) {
        this.costo = costo;
        this.tipo = tipo;
    }

    public Tipo tipo() {
        return this.tipo;
    }

    protected abstract double costo();

}
