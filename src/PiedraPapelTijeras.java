import javax.swing.JOptionPane;
import java.util.Random;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijeras"};
        Random random = new Random();

        JOptionPane.showMessageDialog(null, "¡Bienvenido a Piedra, Papel o Tijeras!");

        while (true) {
            String jugador = (String) JOptionPane.showInputDialog(
                    null,
                    "Elige Piedra, Papel o Tijeras (o Cancelar para salir):",
                    "Piedra, Papel o Tijeras",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (jugador == null) {
                JOptionPane.showMessageDialog(null, "Gracias por jugar. ¡Hasta luego!");
                break;
            }

            String computadora = opciones[random.nextInt(opciones.length)];

            String resultado;

            if (jugador.equals(computadora)) {
                resultado = "Empate. Ambos eligieron " + jugador + ".";
            } else if ((jugador.equals("Piedra") && computadora.equals("Tijeras")) ||
                    (jugador.equals("Papel") && computadora.equals("Piedra")) ||
                    (jugador.equals("Tijeras") && computadora.equals("Papel"))) {
                resultado = "¡Ganaste! " + jugador + " vence a " + computadora + ".";
            } else {
                resultado = "Perdiste. " + computadora + " vence a " + jugador + ".";
            }

            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}
