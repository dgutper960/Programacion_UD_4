package tema_4.practica.ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**Creamos los objetos que formarán para el array */
        Geometria circulo1 = new Circulo(7.2d);
        Geometria circulo2 = new Circulo(3.5d);

        Geometria cuadrado1 = new Cuadrado(8d);
        Geometria cuadrado2 = new Cuadrado(9d);

        Geometria triangulo1 = new Triangulo(2d, 6d, 3d);
        Geometria triangulo2 = new Triangulo(5d, 10d, 20d);

        /** Creamos el array "figuras", que será de tipo Geometría, con los objetos inicializados arriba */
        Geometria[] figuras = {circulo1, circulo2, cuadrado1, cuadrado2, triangulo1, triangulo2 };

        /** Ejecutamos el método calcularAreaTotal para calcular el área */
        System.out.println("Área total de las figuras: " + calcularAreaTotal(figuras));
        System.out.println("Perímetro total de las figuras: " + calcularPerimetroTotal(figuras));

    }

    private static double calcularAreaTotal(Geometria[] figurasParaCalcularArea){
        /** Creamos estas variables para comprobar que si un elemento es el primero de su tipo */
        boolean primerCirculo = true, primerCuadrado = true, primerTrianguloIsos = true;
        double areaTotal = 0; /** Variable de tipo double para el return */
        for(int i = 0; i < figurasParaCalcularArea.length; i++){ /** Mientras que 'i' sea menor a 'figurasParaCalcularArea' se ejecuta: */
            areaTotal += figurasParaCalcularArea[i].calcularArea(); /** Al valor de "areaTotal" se le suma el resultado de calcularArea() del elemento 'i' */

            /** Usamos "instanceof" para comprobar la instancia del elemento 'i' y si es el primero de su tipo lo coloreamos.
             * Ponemos el booleano "primerCirculo" en 'false' */
            if (primerCirculo && figurasParaCalcularArea[i] instanceof Circulo){
                primerCirculo = false;
                ((Circulo) figurasParaCalcularArea[i]).colorear("Azul");
            }
            else if (primerCuadrado && figurasParaCalcularArea[i] instanceof Cuadrado){
                primerCuadrado = false;
                ((Cuadrado) figurasParaCalcularArea[i]).colorear("Azul");
            }
            else if (primerTrianguloIsos && figurasParaCalcularArea[i] instanceof Triangulo){
                primerTrianguloIsos = false;
                ((Triangulo) figurasParaCalcularArea[i]).colorear("Azul");
            }
        }
        return areaTotal;
    }

    private static double calcularPerimetroTotal(Geometria[] figurasParaCalcularArea){
        double perimetroTotal = 0; /** Variable de tipo double para el return */
        for(int i = 0; i < figurasParaCalcularArea.length; i++){ /** Mientras que "i" sea menor que 'figurasParaCalcularArea' se ejecuta: */
            perimetroTotal += figurasParaCalcularArea[i].calcularPerimetro(); /** A 'perimetroTotal' se le suma el resultado de calcularArea() del elemento "i" */

            if (figurasParaCalcularArea[i].equals("circulo1") ){
                ((Circulo) figurasParaCalcularArea[i]).colorear("Azul");
            }
            else if (figurasParaCalcularArea[i].equals("cuadrado1") ){
                ((Cuadrado) figurasParaCalcularArea[i]).colorear("Morado");
            }
            else if (figurasParaCalcularArea[i].equals("triangulo1") ){
                ((Triangulo) figurasParaCalcularArea[i]).colorear("Naranja");
            }
        }
        return perimetroTotal;
    }

}