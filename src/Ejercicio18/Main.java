package Ejercicio18;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int salario = 0;
        System.out.println("Introduzca las horas trabajadas: ");
        int horas = scanner.nextInt();
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
        System.out.println("La fecha es: " + fecha);
        if (fecha.getDayOfWeek() == DayOfWeek.SATURDAY || fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
            salario = horas * 20;//COBRA 20 POR SER FIN DE SEMANA
            System.out.println("La totalidad de dinero a cobrar por ser fin de semana es: " + salario);
        } else {
            salario = horas * 15;//COBRA 15 DE LUNES A VIERNES
            System.out.println("La totalidad de dinero a cobrar por ser día normal es: " + salario);
        }
    }
}
