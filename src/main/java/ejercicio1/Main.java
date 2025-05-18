package ejercicio1;

public class Main {

    public static void main(String[] args) {

        EmpleadoJerarquico director = new EmpleadoJerarquico("unDirector", 100, Cargo.DIRECTOR);
        EmpleadoJerarquico mandoMedio = new EmpleadoJerarquico("mandoMedio", 50, Cargo.MANDOMEDIO);
        EmpleadoRegular empleadoRegular = new EmpleadoRegular(Cargo.JUNIOR, "empleadoRegular", 100);
        director.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(empleadoRegular);
//        director.agregarEmpleado(empleadoRegular);
        new LaserX(director).imprimirCostoSalarial();
    }

}
