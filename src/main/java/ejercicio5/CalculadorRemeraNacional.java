package ejercicio5;

public class CalculadorRemeraNacional extends Calculador {


    public static final double RECARGO_TRANSPORTE = 1.015;
    public static final double BONIFICACION = 0.20;
    public static final double MARGEN_COMERCIAL = 1.15;

    public CalculadorRemeraNacional(int precioUnitario) {
        super(precioUnitario);
    }

    @Override
    public double aplicarRecargos(double precioBase) {
        return precioBase * RECARGO_TRANSPORTE; // 1.5%
    }

    @Override
    public double aplicarBonificaciones(double precioBase) {
        double descuento = precioBase * BONIFICACION;
        return precioBase - descuento;
    }

    @Override
    public double aplicarGanancia(double precioBase) {
        return precioBase * MARGEN_COMERCIAL; // 15%
    }
}

