package Ejercicio29;

import java.util.Arrays;

public class Huevo {
    protected String[] tamanio = new String[4];

    public Huevo(String[] tamanio) {
        tamanio = new String[4];
        tamanio[0] = "S";
        tamanio[1] = "M";
        tamanio[2] = "L";
        tamanio[3] = "XL";

    }

    @Override
    public String toString() {
        return "Huevo{" +
                "tamanio=" + Arrays.toString(tamanio) +
                '}';
    }
}
