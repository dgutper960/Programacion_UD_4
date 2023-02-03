package tema_4.arrays.ejercicios;

import java.util.Arrays;

/** A continuación de la actividad A4.3. continúa creando los siguientes métodos: */




public class Ejercicio_4_5_InsertEraseChange {
    public static void main(String[] args) {

        int[] arrayParaInsertar = {54, 6, 93, 114}; /** Declaración del Array */
        arrayParaInsertar = insertarNuevoElemento(arrayParaInsertar, 25, 0);
        System.out.println(Arrays.toString(arrayParaInsertar));

    }

/** Un método que recibe un array de enteros, un elemento entero y un booleano.
 Devuevle un nuevo array que será una copia del array de entrada pero eliminado el elemento si existe.
 Para ello deberá de buscarlo previamente. La eliminación podrá ser lógica o física, esto es, si el boleano es true,
 se hará el borrado lógico, con lo que se pondrá el valor del elemento en el array a 0, mientras que si el boleano es false,
 se hará borrado físico, eliminado el elemento del array quedando el array con una posición menos. */

    private static int[] insertarNuevoElemento(int[] arrayInt, int numInsertar, int pos) {
        int[] arrayPostInsercion = new int[arrayInt.length + 1];

        for (int i = 0; i < pos; i++) {
        arrayPostInsercion[i] = arrayInt[i];
        }
        arrayPostInsercion[pos] = numInsertar;
        for (int i = pos + 1; i < arrayPostInsercion.length; i++) {
            arrayPostInsercion[i] = arrayInt[i - 1];
        }
        return arrayPostInsercion;
    }


//TODO FALTA REVISAR BIEN ESTE EJERCICIO

 /** Un método que recibe un array de enteros, un elemento entero y una posición.
  Devuelve otro array que será una copia del array de entrada pero insertando un nuevo elemento
  (el indicado en los parámetros) en la posición indicada. Ahora sobrecarga el método para que reciba
  en lugar de un elemento entero un elemento que sea otro array de enteros.
  Habrá que insertar los elementos de este array empezando desde la posición. **/


/** Un método que reciba un array de enteros como parámetro de entrada y salida,
 de modo que intercambie todas las posiciones pares por las impares **/

}