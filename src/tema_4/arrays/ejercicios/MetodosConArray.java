package tema_4.arrays.ejercicios;

public class MetodosConArray {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        String z = "hola";
        Double[] arrayDeEntrada = {1d, 2d, 3d};
        int[][] datosRetorno = metodo(x, y, z, arrayDeEntrada);
        System.out.println(x);
        // Siempre es uno porque el tipo de almacenaje es por valor

    }
    static int[][] metodo (int x , int y, String z, Double[] arrayDeEntrada){
        x =3;//Esta variable x = 3 es solo válida en el contexto del método. Fuera seguirá siendo 1
        return new int[2][2];
    }
}
