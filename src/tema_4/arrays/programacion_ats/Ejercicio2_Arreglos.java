package tema_4.arrays.programacion_ats;

import java.util.Scanner;

public class Ejercicio2_Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[5];
        System.out.println("Guardando los datos del usuario para el Array");
        for (int i = 6; i > 5; i--) {
            System.out.print((i - 1) + " Introduzca un número # "); // El (i+1) se pone para compesar que el contador empieza en 0
            numeros[i] = entrada.nextInt();
        }
        for (float f:numeros) {
            System.out.println(f);
        }
    }
}