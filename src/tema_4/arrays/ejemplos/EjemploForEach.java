package tema_4.arrays.ejemplos;

public class EjemploForEach {
    public static void main(String[] args) {
        /** Declaramos un Array con por ejemplo String */

        String[] arrayString = {"Peras", "Manzanas", "Puding con Pasas", "Zumo de melocotón"};
        for (String i:arrayString) {
            System.out.print(i+", ");
        }
        /** Declaramos y leemos un Array con el for normal */
        int[] ArrayInt = {89,69,39,49,99};
        for(int i = 0; i < ArrayInt.length; i++){
            System.out.print(ArrayInt[i]+",");
        }
        /**Esto imprimirá las dos array en una línea*/
    }
}
