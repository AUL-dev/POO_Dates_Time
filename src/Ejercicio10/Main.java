package Ejercicio10;

import java.time.LocalDate;
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
        int dia3 = 0;
        int mes3 = 0;
        int anio3 = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            if (contador == 0) {
                System.out.println("Introduzca un día: ");
                dia1 = scanner.nextInt();
                System.out.println("Introduzca un mes: ");
                mes1 = scanner.nextInt();
                System.out.println("Introduzca un año: ");
                anio1 = scanner.nextInt();
            } else if (contador == 1) {
                System.out.println("Introduzca un día: ");
                dia2 = scanner.nextInt();
                System.out.println("Introduzca un mes: ");
                mes2 = scanner.nextInt();
                System.out.println("Introduzca un año: ");
                anio2 = scanner.nextInt();
            } else {
                System.out.println("Introduzca un día: ");
                dia3 = scanner.nextInt();
                System.out.println("Introduzca un mes: ");
                mes3 = scanner.nextInt();
                System.out.println("Introduzca un año: ");
                anio3 = scanner.nextInt();
            }

            dia = (contador == 0) ? dia1 : (contador == 1) ? dia2 : dia3;
            mes = (contador == 0) ? mes1 : (contador == 1) ? mes2 : mes3;


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
        } while (contador < 3);

        LocalDate fecha1 = LocalDate.of(anio1, mes1, dia1);
        LocalDate fecha2 = LocalDate.of(anio2, mes2, dia2);
        LocalDate fecha3 = LocalDate.of(anio3, mes3, dia3);
        System.out.println("La primera fecha es: " + fecha1);
        System.out.println("La segunda fecha es: " + fecha2);
        System.out.println("La tercera fecha es: " + fecha3);
        System.out.println("***************************");
        if (fecha1.isBefore(fecha2) && fecha1.isBefore(fecha3)) {
            System.out.println("La primera fecha es la mayor. " + fecha1);
        } else if (fecha1.isAfter(fecha2) && fecha1.isAfter(fecha3)) {
            System.out.println("La primera fecha es la menor. " + fecha1);
        } else {
            System.out.println("La primera fecha es la intermedia. " + fecha1);
        }

        if (fecha2.isBefore(fecha1) && fecha2.isBefore(fecha3)) {
            System.out.println("La segunda fecha es la mayor. " + fecha2);
        } else if (fecha2.isAfter(fecha1) && fecha2.isAfter(fecha3)) {
            System.out.println("La segunda fecha es la menor. " + fecha2);
        } else {
            System.out.println("La segunda fecha es la intermedia. " + fecha2);
        }
        if (fecha3.isBefore(fecha1) && fecha3.isBefore(fecha2)) {
            System.out.println("La tercera fecha es la mayor. " + fecha3);
        } else if (fecha3.isAfter(fecha1) && fecha3.isAfter(fecha2)) {
            System.out.println("La tercera fecha es la menor. " + fecha3);
        } else {
            System.out.println("La tercera fecha es la intermedia." + fecha3);
        }

        if (fecha1.isEqual(fecha2) || fecha1.isEqual(fecha3) || fecha2.isEqual(fecha3)) {
            throw new Exception("Escoge fechas diferentes.");
        }
    }
}
