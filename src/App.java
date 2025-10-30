import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int NumeroApostadores = 2;
        String modoDeJuego = "martingala"; //numeroConcreto || pares || martingala
        Apostador[] apostadores = new Apostador[NumeroApostadores];
        Thread[] hilos = new Thread[NumeroApostadores];
        

        Casino casino = new Casino();

        for (int i = 0; i < NumeroApostadores; i++) {

            System.out.println("Nombre para el apostador " + (i + 1));
            String nombreApostador = scanner.nextLine();
            
            System.out.println("Numero a apostar para el apostador " + nombreApostador);
            int numeroApuesta = scanner.nextInt();
            scanner.nextLine();
            apostadores[i] = new Apostador(nombreApostador, casino.banca, numeroApuesta, casino, modoDeJuego);
            
        }
        
            scanner.close();


        for (int i = 0; i < hilos.length; i++) {
            
            hilos[i] = new Thread(apostadores[i]);

            hilos[i].start();
        }

            //Depuracion
            // System.out.println("La banca tiene " + apostadores[0].banca.getSaldo());

        }
    }

