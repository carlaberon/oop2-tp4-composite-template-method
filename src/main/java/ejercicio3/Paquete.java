package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Paquete extends Seguro {
    private List<Seguro> seguros;

    public Paquete(Tipo tipo, double costo) {

        super(tipo, costo);
        seguros = new ArrayList<>();
    }

    @Override
    protected double costo() {
        double costoTotal = 0;
        for (Seguro seguro : this.seguros) {

            costoTotal += aplicoDescuento(seguro.costo());
        }

        return costoTotal;
    }

    private double aplicoDescuento(double costo) {

        return costo - (costo * Seguro.DESCUENTO);
    }

    public void addSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }

}
