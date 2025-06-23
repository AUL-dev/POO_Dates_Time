package Ejercicio21;

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
        LocalDate fechaEntrega = LocalDate.of(anio, mes, dia);
        System.out.println("La fecha de entrega del documento es: " + fechaEntrega);
        LocalDate fechaLimite = LocalDate.now();
        System.out.println("La fecha límite del documento es: " + fechaLimite);
        if (fechaEntrega.isBefore(fechaLimite) || fechaEntrega.isEqual(fechaLimite)) {
            System.out.println("El documento está dentro de plazo");
        } else {
            System.out.println("El documento está fuera de plazo");
        }


    }
}
