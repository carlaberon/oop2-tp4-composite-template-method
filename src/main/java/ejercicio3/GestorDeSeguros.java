package ejercicio3;

import java.util.List;

public class GestorDeSeguros {

    private List<Seguro> seguros;

    public GestorDeSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    public double calcularCostoTotal() {
        double costoTotal = 0;
        for (Seguro seguro : this.seguros) {
            costoTotal += seguro.costo();
        }
        return costoTotal;
    }
}
