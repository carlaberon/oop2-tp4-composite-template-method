package ejercicio3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCalcularCostoSeguros {
    @Test
    public void testCalcularCostoSeguros() {
        //setup
        Seguro seguroVida = new Vida(Tipo.VIDA, 1000);
        Seguro seguroHogar = new Hogar(Tipo.HOGAR, 500);
        Seguro seguroMedico = new Medicos(Tipo.MEDICOS, 2000);
        Seguro seguroAutomovil = new Automovil(Tipo.AUTOMOVIL, 1500);
        GestorDeSeguros gestor = new GestorDeSeguros(List.of(seguroVida, seguroHogar, seguroMedico, seguroAutomovil));

        //ejercitacion - verificacion
        assertEquals(1000, seguroVida.costo(), 0.01);
        assertEquals(500, seguroHogar.costo(), 0.01);
        assertEquals(2000, seguroMedico.costo(), 0.01);
        assertEquals(1500, seguroAutomovil.costo(), 0.01);
        assertEquals(5000, gestor.calcularCostoTotal(), 0.01);
    }

    @Test
    public void testCalcularCostoPaquete() {
        //setup
        Paquete paquete = new Paquete(Tipo.PAQUETE, 0);
        Seguro seguroVida = new Vida(Tipo.VIDA, 1000);
        Seguro seguroHogar = new Hogar(Tipo.HOGAR, 500);
        paquete.addSeguro(seguroVida);
        paquete.addSeguro(seguroHogar);
        GestorDeSeguros gestor = new GestorDeSeguros(List.of(paquete));

        //ejercitacion - verificacion
        assertEquals(1000, seguroVida.costo(), 0.01);
        assertEquals(500, seguroHogar.costo(), 0.01);
        assertEquals(1425, gestor.calcularCostoTotal(), 0.01);
    }
}
