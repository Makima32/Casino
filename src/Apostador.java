public class Apostador implements Runnable {

    private String nombre;
    private int saldo;
    private int numeroApuesta;
    private boolean gambling;
    Banca banca;
    Casino casino;
    String modoJuego;

    public Apostador(String nombre, int numeroApuesta, Casino casino, String modoJuego) {
        this.nombre = nombre;
        this.saldo = 1000;
        this.banca = casino.banca;
        this.numeroApuesta = numeroApuesta;
        this.casino = casino;
        this.modoJuego = modoJuego;
        this.gambling = true;
    }

    @Override
    public void run() {

        while (gambling) {

            casino.ruleta.CrupierTira(3000);
            
            casino.JugarRuletaFrancesa(modoJuego, this);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroApuesta() {
        return numeroApuesta;
    }

    public void setNumeroApuesta(int numeroApuesta) {
        this.numeroApuesta = numeroApuesta;
    }

    public boolean isGambling() {
        return gambling;
    }

    public void setGambling(boolean gambling) {
        this.gambling = gambling;
    }

    public void sumarSaldo(int saldoParaSumar) {

        saldo += saldoParaSumar;
        
        banca.RestarSaldo(saldoParaSumar);
    }

    public void restarSaldo(int saldoParaRestar) {

        saldo -= saldoParaRestar;
        banca.SumarSaldo(saldoParaRestar);

    }

}
