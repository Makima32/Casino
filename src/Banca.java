public class Banca {

    private int saldo;

    

    public Banca() {
        this.saldo = 50000;
    }

    public synchronized int getSaldo() {
        return saldo;
    }

    public synchronized void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public synchronized void SumarSaldo(int saldo) {

        this.saldo += saldo;

    }

    public synchronized void RestarSaldo(int saldo) {

        this.saldo -= saldo;

        if (this.saldo < 0) {

            System.out.println("La banca se ha quedado sin dinero, Fin del juego");
            System.exit(1);
        }
    }

}
