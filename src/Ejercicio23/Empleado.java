package Ejercicio23;

public class Empleado extends Persona {
    private int anioIncorporcion;
    private int numDespacho;

    public Empleado(String nombre, String apellidos, String DNI, String estdoCivil, int anioIncorporcion, int numDespacho) {
        super(nombre, apellidos, DNI, estdoCivil);
        this.anioIncorporcion = anioIncorporcion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporcion() {
        return anioIncorporcion;
    }

    public void setAnioIncorporcion(int anioIncorporcion) {
        this.anioIncorporcion = anioIncorporcion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public int reasignacionDespacho(int numDespacho) {
        int nuevoDespacho = 0;

        while (true) {
            nuevoDespacho = (int) (Math.random() * 10) + 1;
            if (nuevoDespacho != numDespacho) {
                setNumDespacho(nuevoDespacho);
            } else {
                nuevoDespacho = (int) (Math.random() * 10) + 1;
                setNumDespacho(nuevoDespacho);
            }
            return getNumDespacho();

        }
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "anioIncorporcion=" + anioIncorporcion +
                ", numDespacho=" + numDespacho +
                '}';
    }
}
