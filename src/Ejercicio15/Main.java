package Ejercicio15;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un día: ");
        int dia = scanner.nextInt();
        System.out.println("Introduzca un mes: ");
        int mes = scanner.nextInt();
        System.out.println("Introduzca un año: ");
        int anio = scanner.nextInt();
        System.out.println("Introduzca una hora: ");
        int hora = scanner.nextInt();
        System.out.println("Introduzca los minutos: ");
        int minutos = scanner.nextInt();
        System.out.println("Introduzca los segundos: ");
        int segundos = scanner.nextInt();

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

        if (hora < 1 || hora > 24) {
            throw new Exception("Escoge una hora correcta.");
        }
        if (minutos < 0 || minutos > 60) {
            throw new Exception("Escoge minutos correctos.");
        }
        if (segundos < 0 || segundos > 60) {
            throw new Exception("Escoge segundos correctos.");
        }
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern(",d MMMM" + " yyyy" + " HH:mm:ss");
        LocalDateTime fecha = LocalDateTime.of(anio, mes, dia, hora, minutos, segundos);
        String fechaFormateada = fecha.format(formatoFecha);
        DateTimeFormatter formatoDiaSemana = DateTimeFormatter.ofPattern("EEEE", Locale.forLanguageTag("es"));
        String nombreDia = fecha.format(formatoDiaSemana);
        System.out.println(nombreDia + fechaFormateada);


    }
}
