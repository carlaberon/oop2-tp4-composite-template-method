package ejercicio2;

public class Task implements Item {
    private String name;
    private String description;
    private int duracion;

    public Task(String name, String description, int duracion) {
        this.name = name;
        this.description = description;
        this.duracion = duracion;
    }

    @Override
    public void addTask(Item tarea) {
    }

    @Override
    public int calcularDuracionTotal() {
        return 0;
    }

    public int duracion() {
        return this.duracion;
    }
}
