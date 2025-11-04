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

    /**
     * 
     * @param saldo
     * @return suma saldo a la banca
     */
    public synchronized void SumarSaldo(int saldo) {

        this.saldo += saldo;

    }

    /**
     * 
     * @param saldo
     * @return resta saldo a la banca
     */
    public synchronized void RestarSaldo(int saldo) {

        this.saldo -= saldo;

        if (this.saldo < 0) {

            System.out.println("La banca se ha quedado sin dinero, Fin del juego");
            System.exit(1);
        }
    }

}
