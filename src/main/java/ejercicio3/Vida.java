package ejercicio3;

public class Vida extends Seguro {

    public Vida(Tipo tipo, double costo) {
        super(tipo, costo);
    }

    @Override
    protected double costo() {
        return this.costo;
    }
}
