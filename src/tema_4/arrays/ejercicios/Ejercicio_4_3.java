package tema_4.arrays.ejercicios;

import java.util.Arrays;

public class Ejercicio_4_3 {

    public static void main(String[] args) {

        int[] arrayParaComparar1 = {1, 2, 3, 4, 5}; // Array 1 para comparar
        int[] arrayParaComparar2 = {1, 2, 3, 4, 5}; // Array 2 para comparar

        /** 1.- Crea un array con 10 números aleatorios */
        int[] arrayAleatorio = arrayAleatorio();
        System.out.println("Enunciado 1");
        System.out.println(Arrays.toString(arrayAleatorio));


        /** 2.- Imprime el array anterior empezando por la última posición */;
        System.out.println("Enunciado 2");
        System.out.println(imprimeInverso(arrayAleatorio));


        /** 3.- Ordena el array utilizando la clase de utilidades Arrays */
        System.out.println("Enunciado 3");
        System.out.println(ordenaArray(arrayAleatorio));


        /** 4.- Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes, primero el manual y luego el binarySearch */
        System.out.println("Enunciado 4");
        System.out.println(buscaManual(arrayAleatorio, 50)); //Llamada al método buscaManual
        System.out.println(buscaBinaria(arrayAleatorio, 50)); //Llamada al metodo buscaBinario


        /** 5.- Compara dos arrays recibidos por parámetros devolviendo si son iguales o no */
        System.out.println("Enunciado 5");
        compararArrays(arrayParaComparar1, arrayParaComparar2);

    }


    // 1. Crea un array con 10 números aleatorios
    static int[] arrayAleatorio() { /** Creamos nuestro metodo que retornará un array con numeros aleatorios */
        int[] a = new int[5]; /** Declaramos nustro array llamada a para rellenar */
        for (int i = 0; 1 < a.length; i++) { /** el for normal con un recorrido para las pociciones del array */
            a[i] = (int) (Math.random() * 100); /** En cada iteración se declara un valor aleatorio entre 0 y 100, en la posición correspondiente  */
        }
        return a; /** Esto retorna nuestro array llamado a con números aleatorios  */
    }

    //  2. Imprime el array anterior empezando por la última posición
    static int imprimeInverso(int[] a) {/** En este método tomamos como entrada el array a */
        for (int i = a.length; i > 0; i--) { /** Hacemos el for de siempre pero inicializando en a.length y diciendo que i > 0, con decremento por iteración  */
            System.out.print(a[i] + ", "); /** Decimos que imprima el contenido de [i] en cada iteración */
        }
        System.out.println(); /** Esto nos sirve como salto de linea */
        return 0;
    }

    //3. Ordena el array utilizando la clase de utilidades Arrays
    static int[] ordenaArray(int[] a) {
        Arrays.sort(a); /** símplemente usamos el metodo sort de la clase Arrays */
        return a; /**  Decimos que nos retorne el Array ordenada */
    }

    // 4. Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes:
    //    1. De manera manual
    //    2. Usando la clase de utilidades Arrays

    static int buscaManual(int[] a, int recibido) {
        for (int i = 0; i < a.length; i++) {
            if (recibido == a[i]) {/** En cada iteración vamos comprovando el contenido y comparando con el núm recibido */
                return i;/** Si se cumple la condición retornamos el valor de i para saber la posición del array */
            }
        }
        return -1; /** Este retorno es por si no se clumple la condicion del if (debe retornar in entero) */
    }


    /** 4.- Método Búsqueda Binaria */
    private static String buscaBinaria(int[] a, int x) {
        return "El numero buscado se encuentra en la posición: " + Arrays.binarySearch(a, x);
    }

    /** 5.- Compara dos arrays recibidos por parámetros devolviendo si son iguales o no */
    private static void compararArrays(int[] a, int[] b) {
        System.out.println(Arrays.equals(a, b)); //Este equals es de Arrays
        System.out.println(a.equals(b)); //Este equals es de Object
    }
}

    /** 6.- Realiza 4 copias del array en un nuevo array de 4 posiciones. */
    //    1º Una copia será utilizando el clone
    //    2º La siguiente usando Arrays.copyOf
    //    3º La tercera usando Arrays.copyOfRange
    //    4º La última usando System.arraycopy

