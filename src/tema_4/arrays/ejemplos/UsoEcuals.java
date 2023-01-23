package tema_4.arrays.ejemplos;

import java.util.Arrays;

/** COmparar contenido Arrays -> java.util.Arrays.equals */
public class UsoEcuals {
    public static void main(String[] args) {
        /** Vamos a comparar el contenido de un Array a con el de un Array b **/
        /** Comprobaremos que el para comparar valores de tipo objeto,
         *  solo comparará las referencias a la memoria
         *  para comparar el valor de Array deberemos usar
         *  el operador ecuals de la clase java.util.Arrays*/

        int[]a = {1,2,3};
        int[]b = {1,2,3};
        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));

        b = a;
        b[0] = 0;
        System.out.println(Arrays.equals(a,b));
    }
}
