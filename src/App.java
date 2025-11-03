import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public void pedirDatos() {
        
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

         int NumeroApostadores = 2;
         String modoDeJuego = "numeroconcreto"; // numeroConcreto || pares || martingala
        int numeroApuesta;
        Apostador[] apostadores = new Apostador[NumeroApostadores];
        Thread[] hilos = new Thread[NumeroApostadores];

        Casino casino = new Casino();

        boolean numeroCorrecto = false;
        
        casino.AnuncioJuego(modoDeJuego);

        for (int i = 0; i < NumeroApostadores; i++) {

            System.out.println("Nombre para el apostador " + (i + 1));
            String nombreApostador = scanner.nextLine();

            System.out.println("Numero a apostar para el apostador " + nombreApostador);

            
          
                
          
                try {

                    numeroApuesta = scanner.nextInt();
                    scanner.nextLine();
                    apostadores[i] = new Apostador(nombreApostador, numeroApuesta, casino, modoDeJuego);
                    
                    // Comprobar que mete un numero entero
                } catch (InputMismatchException e) {

                    System.out.println("\n ---------- ERROR ----------");
                    System.out.println("  Elige un puto numero y aprende a leer ");

                }

      
                    
        }

        scanner.close();

        for (int i = 0; i < hilos.length; i++) {

            hilos[i] = new Thread(apostadores[i]);

            hilos[i].start();

        }

    }
}
