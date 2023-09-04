//Clase para obtener las notas mayores y menores
public class NotaResaltante {
    // se inicia con esa cantidad para que las notas con mayor puntuación no salga como "Nota menor"
    private int notaMenor = 1000;
    private String nombreMenor;
    private String cursoMenor;
    // Se inicia con cero para comparar de forma correcta la nota mayor y la menor
    private int notaMayor = 0;
    private String nombreMayor;
    private String cursoMayor;

    //Constructor para comparar las notas
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
    //Método para obtener nota menor
    public void getNotaMenor(){
        System.out.println(" La nota menor corresponde al estudiante:"+ nombreMenor);
        System.out.println(" del curso "+cursoMenor + " con "+ notaMenor );
    }
    
    //Método para obtener nota mayor
    public void getNotaMayor(){
        System.out.println(" La nota mayor corresponde al estudiante:"+ nombreMayor);
        System.out.println(" del curso "+cursoMayor + " con "+ notaMayor );
    }
}
