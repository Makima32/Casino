import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int NumeroApostadores = 2;
        String modoDeJuego = "martingala"; // numeroconcreto || pares || martingala
        int numeroApuesta;
        Apostador[] apostadores = new Apostador[NumeroApostadores];
        Thread[] hilos = new Thread[NumeroApostadores];

        Casino casino = new Casino();
        
        // Comprobar que el modo de juego sea el valido
        if (!((modoDeJuego.equals("numeroconcreto")) || (modoDeJuego.equals("pares"))
                || (modoDeJuego.equals("martingala")))) {
            System.out.println("Eliga un modo de juego valido");
            System.exit(1);
        }

        casino.AnuncioJuego(modoDeJuego);

        for (int i = 0; i < NumeroApostadores; i++) {

            System.out.println("Nombre para el apostador " + (i + 1));
            String nombreApostador = scanner.nextLine();

            try {

                System.out.println("Numero a apostar para el apostador " + nombreApostador);
                numeroApuesta = scanner.nextInt();
                if (numeroApuesta > 36) {
                    
                    System.out.println("Elige un numero entre 1 y 36");
                    break;
                }
                scanner.nextLine();
                apostadores[i] = new Apostador(nombreApostador, numeroApuesta, casino, modoDeJuego);

                // Comprobar que mete un numero entero

            } catch (InputMismatchException e) {

                System.out.println("\n ---------- ERROR ----------");
                System.out.println("  Elige un puto numero y aprende a leer ");
                break;
            }

        }

        scanner.close();

        for (int i = 0; i < hilos.length; i++) {

            hilos[i] = new Thread(apostadores[i]);

            hilos[i].start();

        }

    }

}
