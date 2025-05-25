package ejercicio5;

public class CalculadorRemeraImportada extends Calculador {


    public static final double RECARGO_SOBRE_PRECIO_UNITARIO = 1.03;
    public static final double IMPUESTO_ADUANERO = 1.05;
    public static final double MARGEN_COMERCIAL = 1.25;

    public CalculadorRemeraImportada(int precioUnitario) {
        super(precioUnitario);
    }

    @Override
    public double aplicarRecargos(double precioBase) {
        return precioBase * RECARGO_SOBRE_PRECIO_UNITARIO * IMPUESTO_ADUANERO;
    }

    @Override
    public double aplicarBonificaciones(double precioBase) {
        return precioBase;
    }

    @Override
    public double aplicarGanancia(double precioBase) {
        return precioBase * MARGEN_COMERCIAL;
    }
}
