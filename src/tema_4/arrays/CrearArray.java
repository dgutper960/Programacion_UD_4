package tema_4.arrays;

public class CrearArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a);//Esto imprime la referencis que apunta a la posición de memoria del objeto
        System.out.println(a[0]);//Esto imprime el valor de la posicion 0, que es = 1
        System.out.println(a[1]);//Esto imprime el valor de la posicion 1, que es = 2
        System.out.println(a[2]);//Esto imprime el valor de la posicion 2, que es = 3
        System.out.println(a[3]);//Esto imprime el valor de la posicion 3, que es = 4
        System.out.println(a[4]);//Esto imprime el valor de la posicion 4, que es = 5
        //Lo que hay dentro de cada posicion o indice es el elemento


        int [] enteros = {1, 3, 5, 7, 9 }; //como la variable es int, el valor por defecto será 0
        System.out.println(enteros.length); // length nos devuelve el número de posiciones o índices que contiene el Array


    }
}
