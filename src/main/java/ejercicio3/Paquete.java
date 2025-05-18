package ejercicio3;

import java.util.List;

public class Paquete extends Seguro {
    private List<Seguro> seguros;

    public Paquete(Tipo tipo, double costo) {
        super(tipo, costo);
    }

    @Override
    protected double costo() {
        double costoTotal = 0;
        for (Seguro seguro : this.seguros) {
            costoTotal += seguro.costo();
        }
        return costoTotal;
    }

}
