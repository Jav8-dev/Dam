import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce todos los numeros que te apetezca");
        int num = sc.nextInt();
        int vari = 0;
        while (num > 0) {
            System.out.println("pon otro");
            vari++;
            num = sc.nextInt();

        }
        System.out.println("Mira que eres tonto, to lo numero que puede pone y pone uno negativo, has introducido " + vari + " varis");
    }
}
