package tema_4.arrays.ejercicios;

import java.util.Arrays;

/** Crea un array de 10 posiciones donde cada posición tenga la tabla de multiplicar de esa posición,
 * es decir, otro array de 3 posiciones para almacenar el primer operando, el segundo y el resultado.
 * Lo vamos a hacer por ejemplo para la tabla del 1 */
public class OperacionesConArrays {
    public static void main(String[] args) {
        //Declaramos un Array de 2 dimensiones: Una de 10 posiciones y una de 3 posiciones
        int[][] tablaMult = {{1,1},{1,2},{1,3},{1,4},{1,5},{1,6},{1,7},{1,8,},{1,9},{1,10}};

        for(int i = 1; i < tablaMult.length; i++){
            for(int j = 1; j < tablaMult[i].length; i++) {
                System.out.println(Arrays.toString(tablaMult[i]));
            }
        }
    }
}
