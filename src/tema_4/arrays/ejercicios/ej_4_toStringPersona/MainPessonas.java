package tema_4.arrays.ejercicios.ej_4_toStringPersona;

public class MainPessonas {
    public static void main(String[] args) {
        /** Creamos tres Personas, con el constructor que requiere nombre y edad como parámetro */

        Persona persona1 = new Persona("Alejandra", 22); /** Constructor persona1 */
        Persona persona2 = new Persona("Ernesto", 55); /** Constructor persona2 */
        Persona persona3 = new Persona("Francisca", 99); /** Constructor persona3 */

        /** Array de tipo Persona con los valores de las personas 1, 2 y 3 */
        Persona[] arrayPersonas = {persona1, persona2, persona3};

        /** El método "toString" de la clase "Object" muestra por pantalla la referencia a la posición de memoria.
         *  Al sobreescribir el método "toString" en "Persona", se consigue que se devuelvan los valores del objeto creado */

        System.out.println("Presentamos el contenido del arrayPersonas: \n");

        /** Bucle Foreach para imprimir los valores de las posiciones del ArrayPersonas **/
        for (Persona p: arrayPersonas) {
            System.out.println(p);
        }
    }
}
