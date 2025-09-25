import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero para decirte cual es su divisor");
        int num = sc.nextInt();
        int numcomprobacion = 2;
        while (numcomprobacion <= num / 2 && num % numcomprobacion != 0){
            numcomprobacion++;
        }
        if (num % numcomprobacion == 0) {
            System.out.println("El primer divisor es" + numcomprobacion);
        } else {
            System.out.println("El numero " + num + " primo");
        }
    }
}
