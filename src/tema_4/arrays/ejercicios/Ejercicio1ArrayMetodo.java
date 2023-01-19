package tema_4.arrays.ejercicios;

public class Ejercicio1ArrayMetodo {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String s = "Esto es el valor de s";
        m(x);
        Double[] a = {1d,2.5d,34.56,null,0d};
        System.out.println(x);
    }

    static void m (int x) {//Punto enunciado 4
            x = x + 1;
    }

    private static void m(int x, String s)  {//Punto enunciado 5
        s = s.toLowerCase();
        m(x);//invocacion al metodo x
    }
    //Punto 6 Enunciado
    private  static void m(int x,String s, Double [] a){
        a[0]++;
        a[a.length -1]++;
        a[(a.length -1)/2]++;
        a[(int) Math.floor((double)a.length/2)]++;
    }
    //Punto 7 del enunciado
    static int[][] m2 (int x,String s, Double [] input){//Lo llamamos m2 por que da error al sobrecargar(tiene los mismos parametros que el de arriba)
        int n = input.length;
        int m = 2;//Da gual que se llame m porque es un campo y no um  método y el 2 son el n de posiciones
        int[][] output = new int[n][m];

        m(x,s,input); //llamada a los tres métodos

        output[0][0] = (int)Math.floor(input[0]);//Nececitamos convertir los Double a int para el array horizontal
        output[0][1] = (int)Math.round(input[0]);//Con esta función redondeamos


        output[1][0] = (int)Math.floor(input[1]);//
        output[1][1] = (int)Math.round(input[1]);
        //Como este proceso sería bastante repetitivo, lo vamos a meter en un bucle



        return  output;
    }
}
