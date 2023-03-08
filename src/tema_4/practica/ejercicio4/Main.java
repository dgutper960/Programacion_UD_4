package tema_4.practica.ejercicio4;

//TODO EJERCICIO 4
// Implementa un programa que reciba un DNI y responda si se trata de un DNI válido.
// El cálculo de la letra correspondiente a los dígitos se realiza mediante el algoritmo descrito en
// https://www.interior.gob.es/opencms/ca/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/
// Utiliza expresiones regulares.

public class Main {
    public static void main(String[] args) {
        String dni = "31725985N"; /** Variable de tipo String con el DNI */
        validarDNI(dni);          /** Llamada al método validarDNI() */
    }

    private static void validarDNI(String dni) { /** Observese que éste método llama a otros métodos para comprobar si el DNI es correcto */
        if (dni.length() == 9 && Character.isLetter(dni.charAt(8)) == true && formatoCorrecto(dni) == true && letraCorrecta(dni) == true) {
            System.out.println("Válido"); /** Si se cumplen todas las condiciones de arriba, el DNI será válido */
        }
        else System.out.println("No Válido"); /** De lo contrario, no lo será */
    }

    private static boolean formatoCorrecto(String dni) { /** formatoCorrecto() comprobará que los 8 primeros caracteres del DNI no sean letras */
        for (int i = 0; i < dni.length() - 1; i++) { /** Recorremos la longitud de DNI - 1, comprobando que no sean letras */
            if (Character.isLetter(dni.charAt(i))){
                return false; /** return si se encontrase con una letra (inicializado el false)*/
            }
        }
        return true; /** Si no encuntra una letra el return es true */
    }

    private static boolean letraCorrecta(String dni){  /** letraCorrecta() comprueba que la letra es la que toca al hacer la división */
        int conversionDNI = Integer.parseInt(dni.substring(0,8));
        /** Necesitamos solo la parte numérica del DNI para hacer la comprobación de la letra,
         * creamos una variable de tipo int "conversionDNI"de la posición 0 a la 8 usomos el método "substring()
         * y como no puedo inicializar un tipo int a un tipo String, return de substring(), usamos el método parseInt */

        /** Creamos un array que tendrá por orden todas las letras equivalentes al resto de dividir entre 23 */
        Character[] letrasValidas = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        /** Creamos la variable "resto" de tipo int, que será el resultado de dividir la parte numérica del DNI por 23 */
        int resto = conversionDNI % 23;
        /** Creamos la variable "letraCorrecta" de tipo Character que será igual a la letra en la posición del array del resto */
        Character letraCorrecta = letrasValidas[resto];

        if(dni.charAt(8) == letraCorrecta) { /** Si letra en última posición del DNI introducido = "letraCorrecta" */
            return true; /** la condición se cumple, return true */
        }
        else return false;                   /** La condición no se cumple, return falso */
    }
}