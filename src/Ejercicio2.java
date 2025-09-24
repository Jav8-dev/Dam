import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner jose = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10");
        int vari = jose.nextInt();
        while (vari > 10) {
            System.out.println("Ere tonto o que");
            vari = jose.nextInt();
        }
        System.out.println("tabla del " + vari);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %2d = %3d\n", vari, i, vari * i);


        }
    }
}
