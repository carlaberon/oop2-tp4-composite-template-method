package ejercicio2;

import java.time.Duration;
import java.util.List;

import static java.time.Duration.ofMinutes;

public class Main {
    Duration duracion = ofMinutes(50);
    Item task1 = new Spike("definir stackTecnológico", "analizar y definir en función de");
    Item task2 = new Task("crear convenio", "crear métodos y clases", ofMinutes(89));
    Item userHistory = new UserHistory("cargar convenio firmado", "como administrador quiero cargar el convenio firmado para archivarlo");

    Project project = new Project(List.of(task2, userHistory));

}

