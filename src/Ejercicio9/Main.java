package Ejercicio9;

import java.time.LocalDate;
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
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        System.out.println("La fecha dada es: " + fecha);
        LocalDate fecha30Dias = fecha.plusDays(30);
        LocalDate fecha60Dias = fecha.plusDays(60);
        LocalDate fecha90Dias = fecha.plusDays(90);

        System.out.println("La fecha en 30 días es: " + fecha30Dias);
        System.out.println("La fecha en 60 días es: " + fecha60Dias);
        System.out.println("La fecha en 90 días es: " + fecha90Dias);
    }
}
