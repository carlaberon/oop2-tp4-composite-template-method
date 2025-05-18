package ejercicio2;

public class Spike implements Item {
    private final String name;
    private final String description;
    private Tipo tipo;
    private int duracion;

    public Spike(String name, String description, Tipo tipo, int duracion) {
        this.name = name;
        this.description = description;
        this.tipo = tipo;
        this.duracion = duracion;
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
