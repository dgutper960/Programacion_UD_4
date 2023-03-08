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
    /**Usamos el método "length()" de string */
    private static void imprimeLongitudCadena(String cadena) {
        System.out.println("La longitud de la cadena " + cadena + " es de " + cadena.length());
    }

    //TODO Carácter en Posición empezando en 1 (uno)
    /** Usaremos un condicional if. Si se cumple la condición, usamos charAt() para que nos diga
     * el crarcter que se encuentra en la posición indicada.
     * Se resta 1 a la posición ya tenemos en cuenta que el .lenght() cuenta desde 0 */
    private static void caracterEnPosicionEmpezandoEn(String cadena, int pos) {
        if (pos <= cadena.length() && pos >= 0) {
            System.out.println("El carácter en la posición " + pos + " de " + cadena + " es " + cadena.charAt(pos - 1));
        } else System.out.println("Posición no válida");
    }

    //TODO Cuenta ocurrencias de un carácter
    /** Creamos una variable 'contador' para almacenar las ocurrencias
     * usamos un bucle for con 'i' inicializado a 0 cuya condición es que mientras 'i' sea menor que 0,
     * la longitud del String introducido se recorre con el método "charAt()".
     * Cada vez que el caracter en la posición 'i' del String "cadena" sea igual al parámetro char de entrada,
     * al contador se le suma uno. */
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
    /** Usamos el método de Arrays "sort()" para ordenar alfabéticamente el array introducido.
     * Con un bucle for, vamos imprimiendo cada posición. */
    private static void ordenarAlfabeticamenteArray(String[] arrayString) {
        Arrays.sort(arrayString);
        for (int i = 0; i < arrayString.length; i++)
            System.out.print(arrayString[i] + " ");
    }


    //TODO Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que cada vez que aparezca el carácter punto (.)
    // se corte esa frase y se meta en una posición del array y que todas las vocales se sustituyan por el número gráficamente más parecido
    // o --> 0 | i --> 1 | a --> 4 | e --> 3 | u --> 8


    /** EJERCICIO POR RESOLVER */


    //TODO Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor

    /** EJERCICO POR RESOLVER*/
}
