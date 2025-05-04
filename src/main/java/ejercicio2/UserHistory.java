package ejercicio2;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

public class UserHistory extends Item {
    List<Item> tareas;

    public UserHistory(String name, String description) {
        super(name, description);

    }

    @Override
    void addTask(Item tarea) {
        this.tareas.add(tarea);
    }


    @Override
    Optional<Duration> calcularDuracionTotal() {
        return Optional.empty();
    }
}
