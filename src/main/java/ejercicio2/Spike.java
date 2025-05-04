package ejercicio2;

import java.time.Duration;
import java.util.Optional;

public class Spike extends Item {
    public Spike(String name, String description) {
        super(name, description);
    }

    @Override
    void addTask(Item tarea) {

    }

    @Override
    Optional<Duration> calcularDuracionTotal() {
        return Optional.empty();
    }

}
