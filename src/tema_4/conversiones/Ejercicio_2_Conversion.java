package tema_4.conversiones;

import java.util.Arrays;

public class Ejercicio_2_Conversion {
    public static void main(String[] args) {
        int[] numbers = {2,1,11,10};
        String[] strings;
        strings = convertirAStringYOrdenar(numbers);
        System.out.println(Arrays.toString(strings));
    }

    private static String[] convertirAStringYOrdenar(int[] numbers) {
        String[] strings = new String[numbers.length];
        //CONVERSION
        for(int i = 0; i < numbers.length; i++){
            strings[i] = String.valueOf(numbers[i]);
        }

        //ORDENACION
        Arrays.sort(strings); /** Este parametro es de entrada y salida */
        return strings;
    }
    /** LA ORDENACIÓN QUE HACE DEL ARRAY STRING ES ALFABETICA */
}
