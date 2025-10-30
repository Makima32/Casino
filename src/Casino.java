import java.util.Scanner;

public class Casino {
    
    Scanner scanner = new Scanner(System.in);

    Banca banca;
    RuletaFrancesa ruleta;
    // Apostador[] apostadores;
    
    

    public Casino() {

        banca = new Banca();
        ruleta = new RuletaFrancesa();
        // apostadores = new Apostador[numeroJugadores];
        // AgregarJugadores();
     
        }
    
    




    public void JugarRuletaFrancesa(String modoJuego, Apostador apostadores) {
                
            ruleta.Apostar(modoJuego, apostadores);

    }

    //  public void AgregarJugadores() {
        
    //       for (int i = 0; i < apostadores.length; i++) {
        
     
    //     System.out.println("Nombre para el apostador " + (i+1));
    //     String nombreApostador = scanner.nextLine();

    //     System.out.println("Numero a apostar para el apostador " + nombreApostador);
    //     int numeroApuesta = scanner.nextInt();
            
    //     apostadores[i] = new Apostador(nombreApostador, banca, numeroApuesta);

    // }


    

}

