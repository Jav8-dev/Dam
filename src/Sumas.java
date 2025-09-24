public class Sumas {
    public static void main(String[] args) {
        int numero = 0;
        for (int j = 1; j < 101; j++) {
            numero += j++;
        }
        System.out.println("Los numero son " + numero);
    }
}
