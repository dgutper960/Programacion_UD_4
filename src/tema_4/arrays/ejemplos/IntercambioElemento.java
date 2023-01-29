package tema_4.arrays.ejemplos;

/** Desplaza los elementos del array anterior a una posición
 * a la derecha, el último elemento pasaría a la posición 0 */

public class IntercambioElemento {
    public static void main(String[] args) {
        int[] arrayInicial = {7,-2,5,0,6};
        int posInicial;
        int posFinal;

    }
   /* static int[] desplazamiento(int[] arrayInicial, int posInicial, int posFinal){
        int[] arrayFinal = new int[5];
        for(int i = 0; i < arrayInicial.length; i++){ /** Analizamos las condiciones de este if **/
        /*    arrayFinal[i] = arrayInicial[i]; /** Esto hace una copia del array original */
        }
       /* if(posFinal >= 0 && posFinal > 5 && posInicial > posFinal){
            int numInicial = arrayInicial[posInicial]; /**  Creamos una variable para que sea igual a la posicion inicial del array inicial **/
        /*    arrayFinal[posFinal] = numInicial;
        }
    }

}


/**   public static  void test(){
//    int posInicial = 3;
//    int posFinal = 7;
//    //crear el array inicial
//    int[] arrayInicial = {20,5,7,4,32,9,2,14,11,6};
//    int[] arrayFinal = desplazamiento(arrayInicial,posInicial,posFinal);
//    System.out.println("RESULTADO:");
//    //mostrar resultados
//    for (int i = 0; i < arrayFinal.length; i++) {
//        System.out.println(i+") "+arrayFinal[i]);
//    }
// }
//
// private static int[] desplazamiento(int[] arrayInicial, int posInicial, int posFinal){
//    int[] arrayFinal = new int[10];
//
//    //Hacer una copia de tu array original, para que en caso de no cumplirse alguna condición devolver el array original
//    for (int i = 0; i < arrayInicial.length; i++) {
//        arrayFinal[i] = arrayInicial[i];
//    }
//
//    // condiciones del problema
//    if(posInicial >=0 && posFinal <10 && posInicial < posFinal){
//        int numInicial = arrayInicial[posInicial];
//        arrayFinal[posFinal] = numInicial; // hacer el remplazo del numero inicial por el final
//        for (int i = posFinal; i < arrayInicial.length-1; i++) { // hacer los desplazamientos de la posicion final a la derecha
//            arrayFinal[i+1] = arrayInicial[i];
//        }
//        arrayFinal[0] = arrayInicial[arrayInicial.length-1]; // indicar la ultima posicion del array original, como la primera del nuevo array
//        for (int i = 1; i <= posInicial; i++) { // indicar los desplazamientos de la primera posicion del array hasta la posicion inicial
//            arrayFinal[i] = arrayInicial[i - 1];
//        }
//    }
//    return arrayFinal;
// } */