//Clase para obtener las notas mayores y menores
public class NotaResaltante {
    private int notaMenor = 1000;
    private String nombreMenor;
    private String cursoMenor;
    private int notaMayor = 0;
    private String nombreMayor;
    private String cursoMayor;

    public void compararNota(int nota, String nombre, String curso){
        if (nota < notaMenor){
            notaMenor = nota;
            nombreMenor = nombre;
            cursoMenor = curso;
        }
        if (nota > notaMayor){
            notaMayor = nota;
            nombreMayor = nombre;
            cursoMayor = curso;
        }
    }
    public void getNotaMenor(){
        System.out.println(" La nota menor corresponde al estudiante:"+ nombreMenor);
        System.out.println(" del curso "+cursoMenor + " con "+ notaMenor );
    }
    public void getNotaMayor(){
        System.out.println(" La nota mayor corresponde al estudiante:"+ nombreMayor);
        System.out.println(" del curso "+cursoMayor + " con "+ notaMayor );
    }
}
