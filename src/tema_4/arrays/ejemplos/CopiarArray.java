package tema_4.arrays.ejemplos;

import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a.clone();
       /** Array a y b, son objetos diferentes */


       /** Vamos a copiar el contenido del Array usando copyOf*/
       int[] c = Arrays.copyOf(a, a.length);



        a[0] = 0;

        System.out.print(Arrays.toString(a));
        System.out.println(a);
        System.out.print(Arrays.toString(b));
        System.out.println(b);
    }
}
