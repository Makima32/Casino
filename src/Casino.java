
public class Casino {

    Banca banca;
    RuletaFrancesa ruleta;

    public Casino() {

        banca = new Banca();
        ruleta = new RuletaFrancesa();

    }

    /**
     * 
     * @param modoJuego
     * @param apostadores
     * @return Empieza el juego de la ruletaFrancesa
     */
    public void JugarRuletaFrancesa(String modoJuego, Apostador apostadores) {

        ruleta.Apostar(modoJuego, apostadores);

    }

    /**
     * 
     * @param modoJuego
     * @return Imprime por pantalla un mensaje indicando el modo de juego a jugar
     */
    public void AnuncioJuego(String modoJuego) {

        System.out.println("----------------- Los Jugadores van a jugar al modo " + modoJuego.toUpperCase()
                + " -----------------");

    }

}
