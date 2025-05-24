package ejercicio4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculador {
    @Test
    public void testCalculadorJubilado() {
        var cj = new CalculadorJubilado(2);
        assertEquals(110, cj.calcularPrecio(100), 0.01);
    }

    @Test
    public void testCalculadorNoJubilado() {

        var cnj = new CalculadorNoJubilado(2);
        assertEquals(121, cnj.calcularPrecio(100), 0.01);
    }
}
