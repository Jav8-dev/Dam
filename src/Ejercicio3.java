import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escan = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres introducir");
        int var = escan.nextInt();
        while (var == 0) {
            System.out.println("justo ese no me mola crack, pon uno decente");
            var = escan.nextInt();

        }
        for (int i = 1; i < 20 ; i++) {

        }
    }
}