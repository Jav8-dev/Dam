import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te voy a pedir dos numeros tontorron");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int operacion =  0;
        for (int i = 0; i < num2 ; i++) {
            operacion += num1;
        }
        System.out.println("El total ha sido de " + operacion);
        }
    }

