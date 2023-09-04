// clase de estadistica para calcular el promedio, mediana, moda, desviacion estandar.

import java.util.Arrays;

public class Estadistica {
    private int[] notas;
    private double promedio;
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
    public void getPromedio(){
        int suma = 0;
        for(int i=0; i<this.notas.length; i++){
            suma += notas[i];
        }
        promedio = suma / 6;
        System.out.println("El promedio del estudiante es: "+ promedio);
    }

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

    public void getDesviacionEstandar(){
        double desviacion = 0.0;

        for (int i = 0; i < notas.length; i++) {
            desviacion += Math.pow((notas[i] - promedio), 2);
        }
        double sq = desviacion / notas.length;
        double res = Math.sqrt(sq);

        System.out.println("La desviacion estandar del estudiante es: "+res);

    }
}
