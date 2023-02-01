package tema_4.cadenascaracteres;
// TODO -->  Documentacion para clase String
// TODO --> https://open-bootcamp.com/cursos/java/metodos-de-la-clase-string
public class MainConstructorCadenaCaracteres {
    public static void main(String[] args) {

        imprimeLongitudString("David");

        char[] chars = {'c','a'};

        String c = new String(chars);
        int i = chars.length;
        c.length();


        String s = "Hola";
        String s1 = new String("Hola");
        String s2 = new String(new char[]{'H','o','l','a'});
        String s3 = s + " David";
        System.out.println(s3);
    }

    /** Metodo que imprime la longitud de un String s3 */
    static void imprimeLongitudString(String s3){
        System.out.println("La longitud de la cadena "+ s3 +" es "+ s3.length());
    }
    /** Dada una cadena de texto y un caracter de la cadena, que te diga la posisión donde está */
    static int buscarPosiscionCaracter(String s2, char entrada){
        for(int i = 0; i> s2.length(); i++){
            if(s2.length() == entrada){
                return i;
            }
        }
        return s2.length();
    }
}
