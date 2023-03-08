package tema_4.arrays.actividades;

import java.util.Arrays;

public class Act_4_6_Cadenas {
    /*Completa los métodos indicados con los siguientes TODO: */
    public static void main(String[] args) {

        char[] letras = {'c', 'a'};
        String c = new String(letras);

        String cadena = "Esto Es Una Cadena";
        String cadena1 = new String("esto es otra cadena");
        String cadena2 = new String(new char[]{'C', 'A', 'D', 'E', 'N', 'A'});
        String cadena3 = cadena1 + " David Gutierrez";
        String[] cadena4 = {"Julian", "Pablo", "Jossie", "Adri", "Daniel", "Juan Ma", "Fran", "Antonio"};
        int[] numerosString = { 56, 17, -4, 6 };
        String[] strings = numerosConvertidosString(numerosString);

        System.out.println(c);

        System.out.println(cadena);
        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);

        imprimeLongitudCadena("StringParaMedirLongitud");
        caracterEnPosicionEmpezandoEn(cadena, 1);
        System.out.println("Número de ocurrencias de la letra seleccionada en la palabra introducida: " + ocurrenciasDeUnCaracter("cincolobitos", 'o'));
        System.out.print("Array ordenado alfabeticamente: " );
        ordenarAlfabeticamenteArray(cadena4);
        System.out.print("\nArray int --> Array String: ");
        System.out.println(Arrays.toString(strings));
        System.out.print("Codificamos un array: ");
        System.out.println(Arrays.toString(codificarCadena("Esto es un array para codificar pero no se lo digas a nadie, eh?")));

    }

    //TODO Imprimir la longitud de una cadena
    //Usamos el método "length()" de string, que nos devuelve la longitud de la misma
    private static void imprimeLongitudCadena(String cadena) {
        System.out.println("La longitud de la cadena " + cadena + " es de " + cadena.length());
    }

    //TODO Carácter en Posición empezando en 1 (uno)
    //Hacemos una comprobación con if para que salga un mensaje apropiado si el número introducido es mayor que la
    //longitud del array o menor que 0. Si se cumple esta condición usamos el método "charAt()" que nos indica
    //el carácter que se encuentra en la posición indicada, con la peculiaridad que le restamos 1 (uno) a "pos" porque
    //queremos que la primera posición del array sea el 1 (uno) en lugar del 0 (cero)
    private static void caracterEnPosicionEmpezandoEn(String cadena, int pos) {
        if (pos <= cadena.length() && pos >= 0) {
            System.out.println("El carácter en la posición " + pos + " de " + cadena + " es " + cadena.charAt(pos - 1));
        } else System.out.println("Posición no válida");
    }

    //TODO Cuenta ocurrencias de un carácter
    //Creamos una variable contador que contará las ocurrencias
    //Hacemos un bucle con una variable "i" siendo iniciada a cero, y el bucle se repite mientras que "i" sea menor que
    //la longitud del String "s" introducido, en el bucle se recorre cada letra del String con el método "charAt()", y si
    // se cumple la condición de que el carácter en la posición "i" del String "s" es igual al parámetro char
    // introducido, al contador se le suma uno.
    private static int ocurrenciasDeUnCaracter(String cadena, char b) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (b == cadena.charAt(i)) {
                contador++;
            }
        }
        return contador;
    }

    //TODO Imprime cadenas en orden alfabético las cadenas dadas por un array de cadenas
    // Usamos el método de Arrays "sort()" para ordenar alfabéticamente el array introducido, y después con un bucle
    // vamos pintando cada posición. En el orden de unicode las minúsculas están después de las mayúsculas, así que
    // si en el array hubiese una palabra en minúsculas, se pintarían después de las que tienen mayúscula.
    private static void ordenarAlfabeticamenteArray(String[] arrayString) {
        Arrays.sort(arrayString);
        for (int i = 0; i < arrayString.length; i++)
            System.out.print(arrayString[i] + " ");
    }


    //TODO Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que cada vez que aparezca el carácter punto (.)
    // se corte esa frase y se meta en una posición del array y que todas las vocales se sustituyan por el número gráficamente más parecido
    // o --> 0 | i --> 1 | a --> 4 | e --> 3 | u --> 8

    public static String[] codificarCadena (String texto){

        String cambiarVocales = texto.replaceAll("(?i)a", "4").replaceAll("(?i)e", "3").replaceAll("(?i)i", "1").replaceAll("(?i)o", "0").replaceAll("u", "v").replaceAll("U", "V");
        String[] arrayCodificado = cambiarVocales.split("\\.");

        for (int i = 0; i < arrayCodificado.length; i++){
            arrayCodificado[i] = arrayCodificado[i].trim();
        }
        return arrayCodificado;
    }



    //TODO Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor
    private static String[] numerosConvertidosString(int[] arrayInt) {
        String[] arrayString = new String[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++){
            arrayString[i] = String.valueOf(arrayInt[i]);
        }
        Arrays.sort(arrayString);

        return  arrayString;
    }
}
