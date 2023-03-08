package tema_4.practica.ejercicio3;

import java.util.Arrays;
import java.util.Random;

//TODO
// Construye un programa que genere 100 números aleatorios y que posteriormente ofrezca al usuario la posibilidad de:
// Conocer el mayor de los números.
// Conocer el menor de los números.
// Obtener la suma de todos los números.
// Obtener la media de los números.
// Sustituir el valor de un elemento por otro número dado.

public class Main {
    public static void main(String[] args) {

        int[] arrayAleatorio = crearArrayAleatorio(100);
        System.out.println(Arrays.toString(arrayAleatorio));

        System.out.println("El mayor de los números es: " + (numeroMayor(arrayAleatorio)));
        System.out.println("El menor de los números es: " + (numeroMenor(arrayAleatorio)));
        System.out.println("La suma de todos los números es: " + sumarNumeros(arrayAleatorio));
        System.out.println("La media de los números del array es: " + mediaNumeros(arrayAleatorio));
        cambiarValor(arrayAleatorio, 0, 5000);
    }


    /** Usamos Random() para crear el array Aleatorio */
    private static int[] crearArrayAleatorio (int longitud){
        Random random = new Random();
        int[] arrayAleatorio = new int[longitud];

        for(int i = 0; i < 100; i++){
            arrayAleatorio[i] = random.nextInt(1000);
        }
        return  arrayAleatorio;
    }

    /** Conocer el mayor de los números. */
    private static int numeroMayor(int[] array){
        int mayor = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > mayor ){
                mayor = array[i];
            }
        }

        return mayor;
    }

    /** Conocer el mayor de los números. */
    private static int numeroMenor(int[] array){
        int menor = 1000;
        for (int i = 0; i < array.length; i++){
            if (array[i] < menor ){
                menor = array[i];
            }
        }
        return menor;
    }

    /** Obtener la suma de todos los números */
    private static int sumarNumeros (int[] array){
        int suma = 0;
        for(int i = 0; i < 100; i++){
            suma += array[i];
        }
        return  suma;
    }

    /** Obtener la media de los números */
    private static int mediaNumeros (int[] array){
        int suma = 0;
        for(int i = 0; i < 100; i++){
            suma += array[i];
        }
        int media = (suma / 100);
        return  media;
    }

    /** Sustituir el valor de un elemento por otro número dado */
    private static void cambiarValor (int [] array, int pos, int numNuevo){
        System.out.println("El valor de la posición " + pos + " antes del cambio es " + array[pos]);
        array[pos] = numNuevo;
        System.out.println("El valor de la posición " + pos + " después del cambio es " + array[pos]);
    }
}