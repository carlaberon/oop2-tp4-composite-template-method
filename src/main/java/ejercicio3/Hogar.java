package ejercicio3;

public class Hogar extends Seguro {


    public Hogar(Tipo tipo, double costo) {
        super(tipo, costo);
    }

    @Override
    protected double costo() {
        return this.costo;
    }
}
