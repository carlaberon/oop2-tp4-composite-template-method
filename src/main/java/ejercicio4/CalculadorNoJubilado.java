package ejercicio4;

public class CalculadorNoJubilado extends Calculador {

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }


    @Override
    public double incrementoConPromocion() {
        return 0.15;
    }

    @Override
    public double incrementoSinPromocion() {
        return 0.21;
    }


}

