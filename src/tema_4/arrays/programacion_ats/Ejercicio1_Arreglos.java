package tema_4.arrays.programacion_ats;

import java.util.Scanner;

public class Ejercicio1_Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);/** Con esto pedimos valores por teclado */
        float numeros[] = new float[5]; /** Declaramos un array de tipo float con 5 posiciones */
        /** Para rellenar el array con los datos de entrada, usaremos un for normal */
        System.out.println("Guardando los datos del usuario para el Array");
        for(int i = 0; i< numeros.length; i++){
            System.out.print((i+1)+" Introduzca un número # "); // El (i+1) se pone para compesar que el contador empieza en 0
            numeros[i] = entrada.nextFloat(); /** con esto vamos inicializando cada posición que recorra i con el núm por teclado */
        }
        /**  Ahora usaermos el bucle foreach para imprimir los valores del array */
        System.out.println("Los datos que el usuario ha introducido son:");
        for (float n:numeros) {
            System.out.println(n);
        }
    }
}
