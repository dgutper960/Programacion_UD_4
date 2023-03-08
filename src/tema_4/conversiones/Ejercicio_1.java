package tema_4.conversiones;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /** Convertimos un número primitivo 1 con el nombre num1
         * un número entero envoltorio de nombre num2 y de valor 2
         * imprimir el valor String de num1 **/

        int num1 = 1;

        Integer num2 = Integer.valueOf(2);

        // Imprimir valor tipo cadena de num1
        System.out.println(num1 + "");
        System.out.println(String.valueOf(num1));

        //TODO LO QUE VEMOS EN LETRAS GRISES ES PORQUE RESULTA REDUNDANTE Y NO SERÍA NECESARO.
        // PERO LO DEJAMOS POR LOS EJEMPLOS

        // Imprimir valor tipo cadena de num2
        System.out.println(Integer.toString(num2));
        System.out.println(num2.toString());
        System.out.println(num2);
        System.out.println(String.valueOf(num2));
        System.out.println(num2+"");

    }
}
