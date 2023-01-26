package tema_4.arrays.ejercicios;

import java.util.Arrays;

public class Ejercicio_4_3 {
    public static void main(String[] args) {


    }

    // 1. Crea un array con 10 números aleatorios
    static int[] ArrayAleatorio(int num) { /** Creamos nuestro metodo que retornará un array con numeros aleatorios */
        int[] a = new int[num]; /** Declaramos nustro array llamada a para rellenar */
        for(int i = 0; 1 < a.length; i++){ /** el for normal con un recorrido para las pociciones del array */
            a[i] = (int) (Math.random()*77); /** En cada iteración se declara un valor aleatorio entre 0 y 77, en la posición correspondiente  */
        }
        return a; /** Esto retorna nuestro array llamado a con números aleatorios  */
    }

    //  2. Imprime el array anterior empezando por la última posición
    static void imprimeInverso(int[] a){/** En este método tomamos como entrada el array a */
        for(int i = a.length; i > 0; i--){ /** Hacemos el for de siempre pero inicializando en a.length y diciendo que i > 0, con decremento por iteración  */
            System.out.print(a[i]+", "); /** Decimos que imprima el contenido de [i] en cada iteración */
        }
        System.out.println(); /** Esto nos sirve como salto de linea */
    }

     //3. Ordena el array utilizando la clase de utilidades Arrays
    static int[] ordenaArray(int[] a){
        Arrays.sort(a); /** símplemente usamos el metodo sort de la clase Arrays */
        return a; /**  Decimos que nos retorne el Array ordenada */
    }
}





/**


 4. Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes:
    1. De manera manual
    2. Usando la clase de utilidades Arrays
 5. Compara dos arrays recibidos por parámetros devolviendo si son iguales o no.
 6. Realiza 4 copias del array en un nuevo array de 4 posiciones.
    1. Una copia será utlizando el clone
    2. La siguiente usando Arrays.copyOf
    3. La tercera usando Arrays.copyOfRange
    4. La última usando System.arraycopy
 * */