package ejercicio5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculadorRemeras {

    @Test
    public void testCalculadorRemeraNacional() {
        CalculadorRemeraNacional crn = new CalculadorRemeraNacional(2);
        assertEquals(1.8675999999999997, crn.calcularPrecioFinal(), 0.01);
    }

    @Test
    public void testCalculadorRemeraImportada() {
        CalculadorRemeraImportada cri = new CalculadorRemeraImportada(2);
        assertEquals(2.7037500000000003, cri.calcularPrecioFinal(), 0.01);
    }
}
