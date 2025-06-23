package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        String numero = scanner.nextLine();
        double numeroWrapper = Double.parseDouble(numero);
        System.out.println("El número double en wrapper queda: " + numeroWrapper);
    }
}
