package Ejercicio16;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);
        LocalDate fechaModificada = fechaActual.plusYears(10).plusMonths(4).plusDays(5);
        System.out.println("La fecha modificada es: " + fechaModificada);
    }
}
