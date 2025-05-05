package ejercicio2;

public class Spike implements Item {
    private final String name;
    private final String description;

    public Spike(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public void addTask(Item tarea) {
    }

    @Override
    public int calcularDuracionTotal() {
        return 0;
    }

    @Override
    public int duracion() {
        return 0;
    }

}
