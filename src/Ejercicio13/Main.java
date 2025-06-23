package Ejercicio13;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
        if (anio < LocalDate.now().getYear() || anio > LocalDateTime.now().getYear()) {
            throw new Exception("El año debe ser el actual.");
        }
        LocalDate fechaCaducidad = LocalDate.of(anio, mes, dia);
        System.out.println("La fecha de caducidad es: " + fechaCaducidad);
        LocalDate fechaPorDefecto = LocalDate.now();
        if (fechaPorDefecto.isBefore(fechaCaducidad)) {
            System.out.println("El producto NO está caducado.");
        } else {
            System.out.println("El producto SI está caducado.");
        }
    }
}
