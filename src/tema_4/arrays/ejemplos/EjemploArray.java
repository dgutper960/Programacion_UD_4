package tema_4.arrays.ejemplos;

public class EjemploArray {
    public static void main(String[] args) {
    //Las array son variables que almacenan grupos de datos
    //para declarar una array tenemos que tener en cuanta
    //el tipo de datos que almacena, el tamaño de la misma y su número de dimensiones
    //Existen dos formas de declarar arrays una más descriptiva y otra más sintética
    /**Para declarar una Array de la forma más descriptiva hacemos lo siguiente: */
    //Primero el tipo de dato, después casilleros por cada dimensión
    //Despues declaramos su tamaño con el numero dentro del casillero correspondiente

    int[] array1 = new int[5]; //Con esto digo que array1 tiene 5 posiciones (0,1,2,3,4)
    //para declarar valores en las diferentes posiciones lo hacemos por separado
    //Primero el nombre de la Array, dentro del casillero ponemos la posición a la
    //que le queremos dar el valor y luego le declaramos el valor deseado
    array1[0] = 1;
    array1[1] = 2;
    array1[2] = 3;
    array1[3] = 4;
    array1[4] = 5;

    /**Para declarar Arrays de manera más sintetica seria de la siguente forma**/
    //Primero declaramos el tipo de dato y las dimensienes de la Array (1 casilla por dimension)

        int[] array2 = {1,2,3,4,5};
        //Entre llaves ponemos directamente el valor de las diferentes posiciones.
        // Cada posición está separada por una coma

    }

}
