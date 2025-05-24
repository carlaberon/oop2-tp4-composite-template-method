package ejercicio3;

public class Automovil extends Seguro {
    public Automovil(Tipo tipo, double costo) {
        super(tipo, costo);
    }

    @Override
    protected double costo() {
        return this.costo;
    }
}
