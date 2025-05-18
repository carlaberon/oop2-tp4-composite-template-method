package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class UserHistory implements Item {
    private List<Item> tareas = new ArrayList<>();
    private String name;
    private String description;
    private Tipo tipo;

    public UserHistory(String name, String description, Tipo tipo) {
        this.name = name;
        this.description = description;
        this.tipo = tipo;

    }

    @Override
    public void addTask(Item tarea) {
        if (tarea.tipo().equals(Tipo.SPIKE) || tarea.tipo().equals(Tipo.USERHISTORY)) {
            throw new RuntimeException("Una historia de usuario se compone de tareas.");
        }
        this.tareas.add(tarea);
    }

    @Override
    public int calcularDuracion() {
        int duracionTotal = 0;
        for (Item task : tareas) {
            duracionTotal += task.calcularDuracion();
        }
        return duracionTotal;
    }

    @Override
    public Tipo tipo() {
        return this.tipo;
    }


}
