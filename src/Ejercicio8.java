import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int num;
        String decision = "S";
        while (decision.equals("S")) {
            System.out.println("Dame un numero");
            num = sc.nextInt();
            System.out.println("¿Quieres darme otro? (S/N)");
            if (decision.equals("N")){
                break;
            }
            if (num < menor) {
                menor = num;
            }
            decision = sc.next();
        }
        System.out.println("El numero menor introducido es "+ menor);
        }
    }
