package tema_4.arrays.programacion_ats;

public class BucleForEach {
    public static void main(String[] args) {
        /** Vamos a declarar un array que contenga nombres */

        String[] nombres = {"David","María","Luisa","Juan","Roberto","Jessica"};

        /** Suponemos que no sabemos cuantos elementos tiene el array**/
        /** Entonces con la funcion .length podemos contabilizar las posiciones del array
         *  Siempre teniendo en cuenta que las posiciones comienzan a contabilizar desde 0 **/
        //System.out.println(nombres.length);/** Esto imprime el número de posiciones que tiene el array */
        /** Usaremos primero el for normal */

        for(int i = 0; i < nombres.length; i ++){
            //System.out.println(nombres[i]); /** Con esto se imprime el valor que contiene el array en cada posición */
        }
        /** Ahora veremos un ejemplo con el bucle foreach que es una evolución de for  */
        /// La sintaxix sería la siguiente:
        /** for(tipoDatoArry variableNueva : nombreDelArray){ */

        for(String e:nombres){
            System.out.println(e); /** Símplemente decioms que imprima la variable que declaramos dentro de foreach */
        }
        /** Como hemos visto no necesitamos usar el .length y incrementos, el foreach lo hace automáticamente  */
    }
}
