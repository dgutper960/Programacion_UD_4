package tema_4.arrays.ejemplos;

import java.util.Arrays;

public class ImprimirConOrden {
    public static void main(String[] args) {
        /** Declaramos un Array de 2 dimensiones o matriz */

            String[][] Nombres = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
       for(int i = 0; i < Nombres.length; i++){
            System.out.println(Arrays.toString(Nombres[i]));
        }
       for(int i = 0; i < Nombres.length; i++){
            for(int j = 0; j < Nombres[i].length; j++){
                System.out.println(Nombres[i][j]);
            }
        }

        /** Ahora lo hacemos con While */

        int i = 0;
        while (i < Nombres.length){
            int j = 0;
            while (j < Nombres.length) {
                System.out.println(Nombres[i][j]);
                j++;
            }
            i++;
        }
    }
}
