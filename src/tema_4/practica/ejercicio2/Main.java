package tema_4.practica.ejercicio2;

//TODO Escribe un programa que sea capaz de contar el número de palabras diferentes
// que hay en un texto que se le pasa por argumento,
// sin tener en cuenta si están escritas en mayúsculas o minúsculas.

    public class Main {
        public static void main(String[] args) {
            System.out.println(contarPalabras("Todo lo que somos es el resultado de lo que hemos pensado"));

        }

        private static int contarPalabras (String texto){ /** Método "contarPalabras" que devolverá un int y el texto para contar como parametro de entrada */
            int contador = 0; /** Variable de tipo int para el return */
            texto = texto.toLowerCase(); /** Pasamos el texto a minusculas */
            String[] arrayPalabrasSeparadas = texto.split(" "); /** Creamos Array cuyos valores son las palabras separadas por comas ('regex'-> introducimos " ") para dividir el texto en palabras )*/
            String[] palabrasDistintas = new String[arrayPalabrasSeparadas.length]; /** Este array será el que usaremos para ver las palabras distintas */

            for (String palabra : arrayPalabrasSeparadas){
                if (!palabraRepetida(palabrasDistintas, contador, palabra)){
                    palabrasDistintas[contador] = palabra;
                    contador++;
                }
            }
            return contador;
        }

        private static boolean palabraRepetida(String[] arrayPalabrasSeparadas, int posicionActual, String palabra){
            boolean repetida = false;
            for (int i = 0; i < posicionActual; i++){
                if (arrayPalabrasSeparadas[i].equals(palabra)){
                    repetida = true;
                    break;
                }
            }
            return repetida;
        }
        
    }

