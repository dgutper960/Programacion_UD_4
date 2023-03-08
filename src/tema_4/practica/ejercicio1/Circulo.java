package tema_4.practica.ejercicio1;

public class Circulo extends Geometria implements  Coloreable{
    double radio;
    String color;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        double area = 3.14 * (radio*radio);
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = 3.14 * (radio*2);
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
        System.out.println("El primer circulo será pintado de color: " + color);
    }
}
