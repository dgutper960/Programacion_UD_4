package tema_4.arrays.ejercicios.ejercicio_4_4_toStringPersona;

public class Persona {
    public String nombre; /** Declaramos la variable nombre */
    public int edad; /** Declaramos la variable edad */

    /** Creamos el metodo Persona que con  nombre y edad como parametro de entrada */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /** Sobreescribimos el método toString para que devuelva la variable con el contenido del nombre y la edad */
    @Override
    public String toString(){
        this.nombre = nombre;
        this.edad = edad;
        return "Su nombre es "+ nombre + " y tiene " + edad + " años.";
    }
}
