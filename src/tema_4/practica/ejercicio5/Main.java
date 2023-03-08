package tema_4.practica.ejercicio5;

//TODO Ejercicio 5
// Escribe el código de un programa que dado el contenido de un texto y una determinada palabra,
// realice búsquedas de la palabra dentro de él. La secuencia de ejecución será:
// crear un texto, crear una palabra, invocar al método con estos parámetros,
// buscar número de ocurrencias de la palabra en texto,
// obtener la salida del método y mostrar por pantalla el número de apariciones de la palabra.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("La palabra introducida " +
                contarOcurrenciasPalabras("Un tipo que camina por la calle ve a otro tipo y, al reparar en su tipo, el tipo se pregunta que clase de tipo será ese tipo",
                        "tipo") + " vez o veces");

    }

    private static int contarOcurrenciasPalabras (String texto, String palabraParaBuscar){ /** Usamos el método del ejercicio 2 */
        int contador = 0; /** Variable de tipo int para sumar veces que se encuentra la palabra */
        String[] arrayParaContar = texto.split(" "); /** Inicializamos array cuyos valores serán las palabras del texto */
        for (int i = 0; i < arrayParaContar.length; i++) { /** Mientras 'i' menor que la longitud del array creado anteriormente */
            if ( palabraParaBuscar.equals(arrayParaContar[i]) ){ /** Si un valor de 'arrayParaContar' es igual a 'palabraParaBuscar': contador + 1 */
                contador++;
            }
        }
        return contador; /** Valor de 'contador' = núm de veces que aparece la palabra en el texto */
    }

}