package tema_4.arrays.ejemplos;

import java.util.Arrays;

public class InmprimirArray {
    /**
     * Declaramos un Array e imprimimos en pantalla
     * lo mismo que sería en declaración con llave
     */
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};

        /**Importamos el metodo ToString de la clase Array*/
        System.out.println(Arrays.toString(a));
    }
}
