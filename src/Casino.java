
public class Casino {

    Banca banca;
    RuletaFrancesa ruleta;

    public Casino() {

        banca = new Banca();
        ruleta = new RuletaFrancesa();

    }

    public void JugarRuletaFrancesa(String modoJuego, Apostador apostadores) {

        ruleta.Apostar(modoJuego, apostadores);

    }

    public void AnuncioJuego(String modoJuego) {
        
        System.out.println("----------------- Los Jugadores van a jugar al modo " + modoJuego.toUpperCase() + " -----------------" );
        
    }

}
