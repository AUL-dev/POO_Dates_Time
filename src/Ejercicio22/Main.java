package Ejercicio22;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate trabajador1 = LocalDate.of(1975, 3, 14);
        LocalDate trabajador2 = LocalDate.of(1980, 6, 23);
        LocalDate trabajador3 = LocalDate.of(2000, 1, 4);
        LocalDate trabajador4 = LocalDate.of(2005, 8, 29);
        LocalDate trabajador5 = LocalDate.of(2016, 7, 30);
        Trabajador[] trabajadores = new Trabajador[5];
        trabajadores[0] = new Trabajador("Lucas", "López", 3000, trabajador1);
        trabajadores[1] = new Trabajador("Jorge", "García", 1220, trabajador2);
        trabajadores[2] = new Trabajador("Manuel", "Valle", 1375, trabajador3);
        trabajadores[3] = new Trabajador("David", "Gonzalez", 1650, trabajador4);
        trabajadores[4] = new Trabajador("Pedro", "Martínez", 2145, trabajador5);

        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Nombre: "+trabajadores[i].getNombre());
            System.out.println(trabajadores[i].getApellidos());
            System.out.println(trabajadores[i].getSueldo());
            int sueldo = trabajadores[i].getSueldo();
            System.out.println(trabajadores[i].getFechaAlta());
            System.out.println(trabajadores[i].retencion(sueldo));

        }
    }
}
