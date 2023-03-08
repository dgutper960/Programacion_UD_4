package tema_4.conversiones;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patrones {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Pa.*"); /** Se define el patrón */
        Matcher m = p.matcher("Pata"); /** Se define el buscador */
        System.out.println(m.matches()); /** nos imprime si se encuentra o no con true o false */

        /** Crea un array con las palabras del siguiente texto */
        // Divide la frase por los espacios
        System.out.println(Arrays.toString("Hola me llamo David".split("")));

        // Busca patrones especificados
        System.out.println("Pa".matches("^Pa"));
    }

}

