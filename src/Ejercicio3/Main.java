package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        String numeroCadena = scanner.nextLine();
        Integer numeroEnteroWrapper = new Integer(numeroCadena);
        System.out.println("La cadena pasada a un wrapper (envoltorio) entero: " + numeroEnteroWrapper);
    }
}
