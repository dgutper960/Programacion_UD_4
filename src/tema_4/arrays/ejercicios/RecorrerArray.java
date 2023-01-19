package tema_4.arrays.ejercicios;

public class RecorrerArray {
    /**Crea un método que reciba un array de enteros y que
     * devuelva un entero con la suma de todos los números que
     * hay dentro. Invoca este método desde un main que imprime el resultado

     * Tendrás que inicializar el array en el main antes de invocar el método */
    public static void main(String[] args) {
        /** a = 7, -2, 5, 0, 6 */

        //Declaramos la Array a
        int[] a = {7, -2, 5, 0, 6};
        //Declaramos la Array b
        recorrerArray(a);
        System.out.println(recorrerArray(a));
    }
    static int recorrerArray(int[] a){
        int suma = 0;
        for (int contenedor: a) {
            suma = contenedor + suma;
        }
        return suma;
    }
    //Para hacerlo con el for Normal
    static int recorrerArray2 (int[] a){
        int resultado = 0;
        for (int i = 0; i < a.length; i++){
            resultado = i + resultado;
        } return resultado;
    }

    /**Declaramos una nueva Array para sumarla con la anterior**/

}
