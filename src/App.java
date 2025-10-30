import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    int NumeroApostadores = 1;
    
    Apostador[] apostadores = new Apostador[NumeroApostadores];
        
    Casino casino = new Casino(NumeroApostadores);

       
          for (int i = 0; i < NumeroApostadores; i++) {
        
     
        System.out.println("Nombre para el apostador " + (i+1));
        String nombreApostador = scanner.nextLine();

        System.out.println("Numero a apostar para el apostador " + nombreApostador);
        int numeroApuesta = scanner.nextInt();
            
        apostadores[i] = new Apostador(nombreApostador, casino.banca, numeroApuesta);

    System.out.println(apostadores[0].getSaldo());

    casino.JugarRuletaFrancesa("numeroconcreto", apostadores);

    System.out.println(apostadores[0].getSaldo());


    }
}
}
