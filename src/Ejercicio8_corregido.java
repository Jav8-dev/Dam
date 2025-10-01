import java.util.Scanner;

public class Ejercicio8_corregido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int num;
        String decision = "S";
        while (decision.equals("S")) {
            System.out.println("Dame un numero");
            num = sc.nextInt();

            String respuestaValida = "";
            while (!respuestaValida.equals("S") && !respuestaValida.equals("N")) {
                System.out.println("¿Quieres darme otro? (S/N)");
                respuestaValida = sc.next().toUpperCase();
                if (!respuestaValida.equals("S") && !respuestaValida.equals("N")) {
                    System.out.println("Respuesta no válida. Por favor, escribe S o N.");
                }
            }
            decision = respuestaValida;

            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("El numero menor introducido es " + menor);
    }
}
