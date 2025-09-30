import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te voy a pedir un numero tontorron");
        int num1 = sc.nextInt();
        System.out.println("Te voy a pedir otro mas");
        int num2 = sc.nextInt();
        int operacion = 0;
        for (int i = 0; i < Math.abs(num2); i++) {
            operacion += num1;
        }
        if (num2 < 0) operacion = -operacion;
        System.out.println("El total ha sido de " + operacion);
    }
}

