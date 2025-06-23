package Ejercicio19;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int contador = 0;
        int dia = 0;
        int mes = 0;
        int dia1 = 0;
        int mes1 = 0;
        int anio1 = 0;
        int dia2 = 0;
        int mes2 = 0;
        int anio2 = 0;
        int retencion = 12;
        int salarioFinal = 0;

        LocalDate fechaActual = LocalDate.now();

        do {
            Scanner scanner = new Scanner(System.in);
            if (contador == 0) {
                System.out.println("Introduzca un día: ");
                dia1 = scanner.nextInt();
                System.out.println("Introduzca un mes: ");
                mes1 = scanner.nextInt();
                System.out.println("Introduzca un año: ");
                anio1 = scanner.nextInt();
            } else {
                System.out.println("Introduzca un día: ");
                dia2 = scanner.nextInt();
                System.out.println("Introduzca un mes: ");
                mes2 = scanner.nextInt();
                System.out.println("Introduzca un año: ");
                anio2 = scanner.nextInt();
            }
            if (anio1 == fechaActual.getYear() || anio2 == fechaActual.getYear()) {
                System.out.println("El año es correcto.");
            } else {
                throw new Exception("Debe ser una fecha del año en curso.");
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
        System.out.println("La primera fecha es: " + fecha1);
        System.out.println("La segunda fecha es: " + fecha2);
        System.out.println("*************++++");
        long diasTranscurridos = ChronoUnit.DAYS.between(fecha1, fecha2);
        int salarioBruto = (int) diasTranscurridos * 55;
        salarioFinal = salarioBruto - salarioBruto * retencion / 100;
        System.out.println("El sueldo final añadiendo la retención es: " + salarioFinal);
    }
}
