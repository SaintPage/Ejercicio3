// Clase para la sede
public class Sede {
    private String nombre;
    private int numeroSede;

    //Constructor con nombre sede y numero
    public Sede(String nombre, int numeroSede){
        this.nombre = nombre;
        this.numeroSede = numeroSede;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSede() {
        return numeroSede;
    }

    public void setNumeroSede(int numeroSede) {
        this.numeroSede = numeroSede;
    }
}
