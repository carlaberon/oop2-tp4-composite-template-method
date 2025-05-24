package ejercicio4;

public class CalculadorJubilado extends Calculador {

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }


    @Override
    public double incrementoConPromocion() {
        return 1;
    }

    @Override
    public double incrementoSinPromocion() {
        return 0.1;
    }


}
