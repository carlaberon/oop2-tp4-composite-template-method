package ejercicio2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestCalcularHoras {
    @Test
    public void calcularHorasHU() {
        //setup
        Item task1 = new Task("crear hu", "descripcion", 1, Tipo.TASK);
        Item task2 = new Task("crear proyecto", "descripcion", 4, Tipo.TASK);
        Item userHistory = new UserHistory("hu", "generar convenio", Tipo.USERHISTORY);
        userHistory.addTask(task1);
        userHistory.addTask(task2);
        //ejercitacion + verificacion
        assertEquals(5, userHistory.calcularDuracion());

    }

    @Test
    public void calcularHorasProyecto() {
        //setup
        Item task1 = new Task("crear hu", "descripcion", 1, Tipo.TASK);
        Item task2 = new Task("crear proyecto", "descripcion", 4, Tipo.TASK);
        Item spike = new Spike("leer doc hu.com", "descripcion", Tipo.SPIKE, 1);
        Item userHistory = new UserHistory("hu", "generar convenio", Tipo.USERHISTORY);
        userHistory.addTask(task1);
        userHistory.addTask(task2);
        Project project = new Project(List.of(spike, userHistory));

        //ejercitacion + verificacion
        RuntimeException ex = assertThrows(RuntimeException.class, () -> userHistory.addTask(spike));

        assertEquals(6, project.calcularHoras());
        
        assertEquals("Una historia de usuario se compone de tareas.", ex.getMessage());


    }
}
