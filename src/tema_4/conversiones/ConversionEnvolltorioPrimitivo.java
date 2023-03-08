package tema_4.conversiones;

public class ConversionEnvolltorioPrimitivo {
    public static void main(String[] args) {

       /** Queremos inicializar una variable primitiva, partiendo de un dato envoltorio */
        int n = Integer.parseInt("1");
        System.out.println(n+1);
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
        Long.parseLong("546541685466746984735");
        Double.parseDouble("8958.36252");

        /** Dada una cadena lo pasamos a envoltirio */
        Integer integer = Integer.valueOf("1");
        Double doble = Double.valueOf("1.222334");
        System.out.println(doble);
    }
}
