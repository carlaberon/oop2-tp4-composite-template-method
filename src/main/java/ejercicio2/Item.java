package ejercicio2;

import java.time.Duration;
import java.util.Optional;

public abstract class Item {
    private final String name;
    private final String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    abstract void addTask(Item tarea);

    abstract Optional<Duration> calcularDuracionTotal();
}
