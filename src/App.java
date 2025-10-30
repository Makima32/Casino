public class App {
    public static void main(String[] args) throws Exception {

    int NumeroApostadores = 1;

    Casino casino = new Casino(NumeroApostadores);


    System.out.println(casino.apostadores[0].getSaldo());

    casino.JugarRuletaFrancesa("numeroconcreto");
    casino.apostadores[0].getSaldo();
    System.out.println(casino.apostadores[0].getSaldo());


    }
}
