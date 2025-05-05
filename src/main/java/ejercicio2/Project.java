package ejercicio2;

import java.util.List;

public class Project {
    private List<Item> items;

    public Project(List<Item> items) {
        this.items = items;
    }

    public int calcularHoras() {
        int horasTotales = 0;
        for (Item task : items) {
            horasTotales += task.calcularDuracionTotal();
        }
        return horasTotales;
    }
}
