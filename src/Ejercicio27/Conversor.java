package Ejercicio27;

import java.util.Scanner;

public class Conversor {
    private int numeroEntero;

    public Conversor(int numeroEntero) {
        this.numeroEntero = numeroEntero;
    }

    public int getNumeroEntero() {
        return numeroEntero;
    }

    public void setNumeroEntero(int numeroEntero) {
        this.numeroEntero = numeroEntero;
    }

    public String getNumero(char sistemaNumerico) throws Exception {
        String opciones = "";
        switch (sistemaNumerico) {
            case 'B':
            case 'b':
                opciones = Integer.toBinaryString(numeroEntero);
                break;
            case 'H':
            case 'h':
                opciones = Integer.toHexString(numeroEntero);
                break;
            case 'O':
            case 'o':
                opciones = Integer.toOctalString(numeroEntero);
                break;
            default:
                throw new Exception("Escoge una opción válida.");
        }
        return opciones;
    }

    public static void main(String[] args) throws Exception {
        Conversor numero = new Conversor(10);

        System.out.println("El número en binario es: " + numero.getNumero('B'));
        System.out.println("El número en hexadecimal es: " + numero.getNumero('H'));
        System.out.println("El número en octal es: " + numero.getNumero('O'));
    }
}
