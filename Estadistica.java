// clase de estadistica para calcular el promedio, mediana, moda, desviacion estandar.
// Links para averiguar Desviacion estandar, moda y mediana:
// https://barcelonageeks.com/programa-java-para-calcular-la-desviacion-estandar/
//https://parzibyte.me/blog/2020/02/28/media-mediana-java/#:~:text=Después%20de%20ordenar%20el%20arreglo,si%20la%20longitud%20es%20par.&text=En%20caso%20de%20que%20la,mediana%20es%20el%20elemento%20central.
// https://programacion.net/foros/java-basico/como_calcular_la_moda_en_java_262212

import java.util.Arrays;

public class Estadistica {
    private int[] notas;
    private double promedio;
    //obtenemos las notas de las clases establecidas
    public Estadistica(Examen notas){
        this.notas = new int[]{
                notas.getMatematicas(),
                notas.getLenguaje(),
                notas.getFisica(),
                notas.getQuimica(),
                notas.getCompresionLectora(),
                notas.getEstadistica()
        };
    }
    //Metodo para obtener promedio
    public void getPromedio(){
        int suma = 0;
        for(int i=0; i<this.notas.length; i++){
            suma += notas[i];
        }
        promedio = suma / 6;
        System.out.println("El promedio del estudiante es: "+ promedio);
    }

    //Obtener mediana
    public void getMediana(){
        Arrays.sort(notas);
        int mitad = notas.length / 2;
        int mediana;
        if (notas.length % 2 == 0) {
            mediana = (notas[mitad - 1] + notas[mitad]) / 2;
        } else {
            mediana = notas[mitad];
        }
        System.out.println("La mediana del estudiante es: "+ mediana);
    }

    //Obtener moda
    public void getModa(){
        int maximaVecesQueSeRepite = 0;
        int moda = 0;

        for(int i=0; i<notas.length; i++){
            int vecesQueSeRepite = 0;
            for(int j=0; j<notas.length; j++){
                if(notas[i] == notas[j]){
                    vecesQueSeRepite++;
                }
            }
            if(vecesQueSeRepite > maximaVecesQueSeRepite){
                moda = notas[i];
                maximaVecesQueSeRepite = vecesQueSeRepite;
            }
        }

        System.out.println("La moda del estudiante es: "+moda+" y se repitió "+maximaVecesQueSeRepite+" veces.");
    }

    //Obtener Desviación Estándar
    public void getDesviacionEstandar(){
        double desviacion = 0.0;

        for (int i = 0; i < notas.length; i++) {
            desviacion += Math.pow((notas[i] - promedio), 2);
        }
        double sq = desviacion / notas.length;
        double res = Math.sqrt(sq);

        //res es el resultado final
        System.out.println("La desviacion estandar del estudiante es: "+res);

    }
}
