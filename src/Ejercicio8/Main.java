package Ejercicio8;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {


        int contador = 0;
        int mes = 0;
        int dia = 0;
        int dia1 = 0;
        int mes1 = 0;
        int anio1 = 0;
        int dia2 = 0;
        int mes2 = 0;
        int anio2 = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduzca un día: ");
            if (contador != 0) {
                dia2 = scanner.nextInt();
            } else {
                dia1 = scanner.nextInt();
            }
            System.out.println("Introduzca un mes: ");
            if (contador != 0) {
                mes2 = scanner.nextInt();
            } else {
                mes1 = scanner.nextInt();
            }
            System.out.println("Introduzca un año: ");
            if (contador != 0) {
                anio2 = scanner.nextInt();
            } else {
                anio1 = scanner.nextInt();
            }
            dia = (contador == 0) ? dia1 : dia2;
            mes = (contador == 0) ? mes1 : mes2;


            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia <= 0 || dia > 31) {
                        throw new Exception("Escoge un día correcto.");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia <= 0 || dia > 30) {
                        throw new Exception("Fecha incorrecta.");
                    }
                    break;
                case 2:
                    if (dia <= 0 || dia > 28) {
                        throw new Exception("Fecha incorrecta.");
                    }
                    break;
                default:
                    throw new Exception("Fecha incorrecta.");
            }

            contador++;
        } while (contador < 2);

        LocalDate fecha1 = LocalDate.of(anio1, mes1, dia1);
        LocalDate fecha2 = LocalDate.of(anio2, mes2, dia2);
        long diasTranscurridos = ChronoUnit.DAYS.between(fecha1, fecha2);
        System.out.println("La primera fecha es: " + fecha1);
        System.out.println("La primera fecha es: " + fecha2);
        System.out.println("Han transcurrido un total de: " + diasTranscurridos);


    }
}
