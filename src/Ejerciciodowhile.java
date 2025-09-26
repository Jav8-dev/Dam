import java.util.Scanner;

public class Ejerciciodowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una contraseña, y que sea valida eh");
        String contra = sc.next();
        int caracteres = contra.length();
        do {
                System.out.println("Tu contra es caca");
            System.out.println("Introduce de nuevo");
                contra = sc.next();
                caracteres = contra.length();
        } while (caracteres < 8);
        System.out.println("Tu contra es buena");
    }
}
