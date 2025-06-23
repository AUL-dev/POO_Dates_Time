package Ejercicio29;

public class Clara extends Huevo{
    private String color;

    public Clara(String[] tamanio, String color) {
        super(tamanio);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clara{" +
                "color='" + color + '\'' +
                '}';
    }
}
