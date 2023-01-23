package tema_4.arrays.ejemplos;
/** Crea un método que reciba un número y un array.
 * Este método debe devolver la posición donde ha encontrado el número
 * En caso de que no lo encuentre debe devlover -1 */

public class BusquedaArray {
    public static void main(String[] args) {
        int numero = 60;
        int[] Array1 = {8, 5, 2, 398, 0, 1};
        int posicion;


    }
/** Para completar este método buscar el 'BinarySearch' del git de fran para ordenar el Array */
    public static int buscar(int numero, int[] Array1) {
        int posicion = -1;
        for (int i = 0; i < Array1.length; i++) {
            if (Array1[i] == numero) {
                posicion = i;
            }
        }
        return posicion;
    }
}



