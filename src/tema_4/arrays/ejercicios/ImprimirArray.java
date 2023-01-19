package tema_4.arrays.ejercicios;

public class ImprimirArray {
    public static void main(String[] args) {
        /** Vamos a declarar un arreglo de tipo int */
        //Tipo de dato, corchete, nombre = llaves; new ...
        int[] valorArray = {7,5,88,-3,3};

        for(int i = 0; i < valorArray.length; i++){
            System.out.println("El número que está en la posición "+i+" es "+valorArray[i]);
        }
        /** Hacemos lo mismo pero intentemos imprimir en horizontal */
        //Tipo char
        char[] letrasArray = {'V','a','n','e','s','a'};

        for(int i = 0; i < letrasArray.length; i++){
            System.out.print(letrasArray[i]);
        }
    }
}
