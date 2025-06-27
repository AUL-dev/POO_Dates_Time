package Ejercicio28;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConversorFechas {

    public static String normalToAmericano(String fecha) {
        DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter salida = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // salida con ceros

        LocalDate fechaFormateada = LocalDate.parse(fecha, entrada);
        return fechaFormateada.format(salida); // aquí sí lo formatea
    }


    public static String americanoToNormal(String fecha) {
        DateTimeFormatter entrada = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter salida = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // salida con ceros

        LocalDate fechaFormateada = LocalDate.parse(fecha, entrada);
        return fechaFormateada.format(salida); // aquí sí lo formatea


    }

   public static void main(String[] args) {
       System.out.println(normalToAmericano("01/12/2015"));
       System.out.println(americanoToNormal("12/01/2025"));
   }
}
