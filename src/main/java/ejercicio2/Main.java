package ejercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item task1 = new Task("crear hu", "descripcion", 1, Tipo.TASK);
        Item task2 = new Task("crear proyecto", "descripcion", 4, Tipo.TASK);
        Item spike = new Task("leer doc hu.com", "descripcion", 1, Tipo.SPIKE);
        Item userHistory = new UserHistory("hu", "generar convenio", Tipo.USERHISTORY);
        userHistory.addTask(task1);
        userHistory.addTask(task2);
        Project project = new Project(List.of(spike, userHistory));
        int horasProject = project.calcularHoras();
        System.out.println(horasProject);
    }
}

