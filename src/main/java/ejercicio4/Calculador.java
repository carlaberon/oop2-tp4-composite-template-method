package ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

abstract class Calculador {

    private int mesEnPromocion;
    private LogTransaction log;

    public Calculador(int mesEnPromocion) {

        this.mesEnPromocion = mesEnPromocion;
        this.log = new LogTransaction();
    }

    public final double calcularPrecio(double precioProducto) {

        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * incrementoConPromocion();
        } else {
            precioTotal += precioProducto * incrementoSinPromocion();
        }
        log.log(this.getClass().getName());
        return precioTotal;
    }


    public abstract double incrementoConPromocion();

    public abstract double incrementoSinPromocion();

}