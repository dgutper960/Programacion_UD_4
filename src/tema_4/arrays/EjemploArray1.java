package tema_4.arrays;

public class EjemploArray1 {
    public static void main(String[] args) {

    int [][] a = new int[5][2];
    //Aquí hay quue ir decalrando cada pocición una a una
        a[0][0] = 0;
        a[1][0] = 0;
        a[2][0] = 0;
        a[3][0] = 0;
        a[4][0] = 0;
        a[0][1] = 0;
        a[1][1] = 1;
        a[2][1] = 2;
        a[3][1] = 3;
        a[4][1] = 4;


    int [][] b = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};


        System.out.println(a.length);//El primer array tiene 5 posiciones
        System.out.println(a[0].length);//El segundo array tiene 2 posiciones
        //'System.out.println(a[][].length);//Esto fa fallo porque lo que está almacenado en la segunda array no es otra array

        int[][] c =  {{0},{0,1},{0,1,2}};



    }

}
