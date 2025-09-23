public class ejercicio1 {
    public static void main(String[] args) {
        for (int inicial = 1; inicial < 100 ; inicial++) {
            if (inicial % 7 == 0) {
                System.out.println("Tu numero " + inicial + " es multiplo de 7");
            } else if (inicial % 13 == 0) {
                System.out.println("Tu numero " + inicial + "es multiplo de 13");
            }
            if (inicial % 7 == 0 && inicial % 13 == 0){
                System.out.println("Tu numero " + inicial + "es multipllo de los dos");
            }

        }
        }