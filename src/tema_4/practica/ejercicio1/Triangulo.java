package tema_4.practica.ejercicio1;

public class Triangulo  extends Geometria implements Coloreable {
    double base;
    double altura;
    double ladosiguales = 3d;
    String color;

    public Triangulo(double base, double altura, double ladosiguales){
        this.base = base;
        this.altura = altura;
        this.ladosiguales = ladosiguales;
    }


    @Override
    double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro = ladosiguales + base;
        return perimetro;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
        System.out.println("El primer triangulo será pintado de color: " + color);
    }
}

