package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        String numeroCadena = scanner.nextLine();
        int numeroEntero = Integer.parseInt(numeroCadena);
        System.out.println("La cadena pasada a número entero: " + numeroEntero);
    }
}
