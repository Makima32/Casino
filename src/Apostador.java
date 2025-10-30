public class Apostador {

    private String nombre;
    private int saldo;
    private int numeroApuesta;
    private int cantidadAApostar;
    private boolean gambling;
    Banca banca;

    public Apostador(String nombre, Banca banca, int numeroApuesta) {
        this.nombre = nombre;
        this.cantidadAApostar = 10;
        this.saldo = 1000;
        this.banca = banca;
        this.numeroApuesta = numeroApuesta;
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

    public int getCantidadAApostar() {
        return cantidadAApostar;
    }

    public void setCantidadAApostar(int cantidadAApostar) {
        this.cantidadAApostar = cantidadAApostar;
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
