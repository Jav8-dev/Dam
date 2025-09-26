import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la cantidad que quieras poner");
        int numeros = sc.nextInt();
        while (numeros <= 0) {
            System.out.println("Introduce de nuevo");
            numeros = sc.nextInt();
        }
        double operacion = 0;
        for (int i = 1; i < numeros + 1; i++) {
            System.out.println("dame el numero " + i);
            double num = sc.nextDouble();
            operacion += num;
        }
        double media = operacion / numeros;
        System.out.println("La media es " + media);
    }
}
