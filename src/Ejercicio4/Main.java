package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int numero = scanner.nextInt();
        System.out.println("Escriba un número: ");
        int numero2 = scanner.nextInt();
        int resultadoNormal = 0;
        System.out.println("Escriba una operación: ");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        scanner.nextLine();
        String operaciones = scanner.nextLine();
        switch (operaciones) {
            case "1":
                resultadoNormal = numero + numero2;
                break;
            case "2":
                resultadoNormal = numero - numero2;
                break;
            case "3":
                resultadoNormal = numero * numero2;
                break;
            default:
                throw new Exception("Escribe un número correcto.");
        }
        System.out.println(resultadoNormal);
        String resultadoBinario = Integer.toBinaryString(resultadoNormal);
        String resultadoHexadecimal = Integer.toHexString(resultadoNormal);
        String resultadoOctal = Integer.toOctalString(resultadoNormal);
        System.out.println("El resultado de la operación es: " + resultadoNormal);
        System.out.println("El resultado de la operación en binario es: " + resultadoBinario);
        System.out.println("El resultado de la operación en hexadecimal es: " + resultadoHexadecimal);
        System.out.println("El resultado de la operación en octal es: " + resultadoOctal);


    }
}
