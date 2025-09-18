import java.util.Scanner;

public class HolaMundo {
    static void main(String[] args) {
        System.out.println("Introduce tu nombre compañero :)");

        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        System.out.println("Hola "+ nombre + "  ere un maquina compañero");
    }
}
