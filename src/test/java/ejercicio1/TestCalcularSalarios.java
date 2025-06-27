package ejercicio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCalcularSalarios {
    @Test
    public void calcularSalarioDirector() {
        //setup
        EmpleadoJerarquico director = new EmpleadoJerarquico("Director", 100, Cargo.DIRECTOR);
        EmpleadoJerarquico mandoMedio = new EmpleadoJerarquico("Mando Medio", 50, Cargo.MANDOMEDIO);
        EmpleadoRegular empleadoRegular = new EmpleadoRegular(Cargo.JUNIOR, "Empleado Regular", 30);

        //ejercitacion
        director.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(empleadoRegular);

        //verificacion
        float salarioTotal = director.calcularSalario();
        assertEquals(180, salarioTotal, 0.01);
    }
    @Test
    public void testearExcepciones() {
        //setup
        EmpleadoJerarquico director = new EmpleadoJerarquico("Director", 100, Cargo.DIRECTOR);
        EmpleadoRegular empleadoRegular = new EmpleadoRegular(Cargo.JUNIOR, "Empleado Regular", 30);

        //ejercitacion + verificacion
        RuntimeException ex = assertThrows(RuntimeException.class, () -> director.agregarEmpleado(empleadoRegular));
        assertEquals(EmpleadoJerarquico.VALIDO_DIRECTOR, ex.getMessage());
    }
}
