package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class UserHistory implements Item {
    private List<Item> tareas = new ArrayList<>();
    private String name;
    private String description;

    public UserHistory(String name, String description) {
        this.name = name;
        this.description = description;

    }

    @Override
    public void addTask(Item tarea) {
        this.tareas.add(tarea);
    }

    @Override
    public int calcularDuracionTotal() {
        int duracionTotal = 0;
        for (Item task : tareas) {
            duracionTotal += task.duracion();
        }
        return duracionTotal;
    }

    @Override
    public int duracion() {
        return 0;
    }

}
