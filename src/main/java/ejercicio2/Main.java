package ejercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item task1 = new Task("crear proyecto", "descripcion", 1);
        Item task2 = new Task("enviar solicitud", "descripcion", 1);
        Item userHistory = new UserHistory("crear convenio", "generar convenio");
        userHistory.addTask(task2);
        Project project = new Project(List.of(task1, userHistory));
        int horasProject = project.calcularHoras();
        System.out.println(horasProject);
    }
}

