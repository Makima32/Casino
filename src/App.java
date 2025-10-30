import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int NumeroApostadores = 1;
        String modoDeJuego = "martingala"; //numeroConcreto || pares || martingala
        Apostador[] apostadores = new Apostador[NumeroApostadores];

        

        Casino casino = new Casino(NumeroApostadores);

        for (int i = 0; i < NumeroApostadores; i++) {

            System.out.println("Nombre para el apostador " + (i + 1));
            String nombreApostador = scanner.nextLine();
            
            System.out.println("Numero a apostar para el apostador " + nombreApostador);
            int numeroApuesta = scanner.nextInt();
            scanner.nextLine();
            apostadores[i] = new Apostador(nombreApostador, casino.banca, numeroApuesta);
            
        }
        
            scanner.close();

            casino.JugarRuletaFrancesa(modoDeJuego, apostadores);


            //Depuracion
            System.out.println("La banca tiene " + apostadores[0].banca.getSaldo());

        }
    }

