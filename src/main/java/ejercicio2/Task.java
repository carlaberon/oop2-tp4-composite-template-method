package ejercicio2;

public class Task implements Item {
    private String name;
    private String description;
    private int duracion;
    private Tipo tipo;

    public Task(String name, String description, int duracion, Tipo tipo) {
        this.name = name;
        this.description = description;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    @Override
    public void addTask(Item tarea) {
    }

    @Override
    public int calcularDuracion() {

        return this.duracion;
    }

    @Override
    public Tipo tipo() {
        return this.tipo;
    }

}
