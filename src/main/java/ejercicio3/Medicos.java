package ejercicio3;

public class Medicos extends Seguro {


    public static final double DESCUENTO = 0.05;

    public Medicos(Tipo tipo, double costo) {
        super(tipo, costo);
    }

    @Override
    protected double costo() {
        return this.costo;
    }
}