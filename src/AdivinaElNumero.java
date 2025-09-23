import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intentos = 0;
        int intentoJugador;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He elegido un número del 1 al 100. ¿Puedes adivinar cuál es?");

        do {
            System.out.print("Introduce tu número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next();
            }
            intentoJugador = scanner.nextInt();
            intentos++;

            if (intentoJugador < numeroSecreto) {
                System.out.println("Más alto.");
            } else if (intentoJugador > numeroSecreto) {
                System.out.println("Más bajo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (intentoJugador != numeroSecreto);

        scanner.close();
    }
}
