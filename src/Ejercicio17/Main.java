package Ejercicio17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);
        LocalDate fechaModificada = fechaActual.minusYears(5).minusMonths(11).minusDays(18);
        System.out.println("La fecha modificada es: " + fechaModificada);
    }
}
