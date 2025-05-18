package ejercicio2;

import java.util.List;

public class Project {
    private List<Item> items;

    public Project(List<Item> items) {
        this.items = items;
    }

    public int calcularHoras() {
        int horasTotales = 0;
        for (Item task : this.items) {
            horasTotales += task.calcularDuracion();
        }
        return horasTotales;
    }
}
