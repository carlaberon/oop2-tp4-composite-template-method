package ejercicio2;

import java.time.Duration;
import java.util.Optional;

public class Task extends Item {
    private Duration duracion;

    public Task(String name, String description, Duration duracion) {
        super(name, description);
        this.duracion = duracion;
    }

    @Override
    void addTask(Item tarea) {
    }

    @Override
    Optional<Duration> calcularDuracionTotal() {
        return Optional.empty();
    }
}
