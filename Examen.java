// clase de examen donde registra las 6 materias que se evaluan
public class Examen {
    private int matematicas;
    private int lenguaje;
    private int quimica;
    private int fisica;
    private int compresionLectora;
    private int estadistica;

    public Examen (int matematicas, int lenguaje, int quimica, int fisica, int compresionLectora, int estadistica){
        this.matematicas = matematicas;
        this.lenguaje = lenguaje;
        this.quimica = quimica;
        this. fisica = fisica;
        this.compresionLectora = compresionLectora;
        this.estadistica = estadistica;
    }

    public int getMatematicas() {
        return matematicas;
    }

    public int getLenguaje() {
        return lenguaje;
    }

    public int getQuimica() {
        return quimica;
    }

    public int getFisica() {
        return fisica;
    }

    public int getCompresionLectora() {
        return compresionLectora;
    }

    public int getEstadistica() {
        return estadistica;
    }
}
