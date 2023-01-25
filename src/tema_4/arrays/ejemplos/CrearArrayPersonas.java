package tema_4.arrays.ejemplos;

import java.util.Arrays;

public class CrearArrayPersonas {
    public static void main(String[] args) {
        Persona A = new Persona();
        A.nombre = "Paco";
        Persona B = new Persona();
        B.nombre = "Julio";
        Persona C = new Persona();
        C.nombre = "Vanesa";

        Persona[] ArrayPersonasA = {A, B, C};
        Persona[] ArrayPersonasB = ArrayPersonasA.clone();
        /** Comprobamos que las personas de ambas Arrays apuntan a la misma posición de memoria */
        /** Hacemos un For each para imprimir el cintenido de las Arrays */

        for(Persona P:ArrayPersonasA){
            System.out.println(P.nombre);
        }
        /** También lo vamos a hacer con un for normal */
        for (int i = 0; i < ArrayPersonasA.length; i++){
            System.out.println(ArrayPersonasA[i].nombre);
        }
        /** Vamos a imprimir las diferentes variables de las Arrays */
        System.out.println(Arrays.toString(ArrayPersonasA));
        System.out.println(ArrayPersonasA);
        System.out.println(Arrays.toString(ArrayPersonasB));

    }

}
