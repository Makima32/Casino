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
    }

        public void restarSaldo(int saldoParaRestar) {
        
        saldo -= saldoParaRestar;
    }

    // public void Apostar(int NumeroApuestaRuleta, String modoJuego) {

    //     // Si es 0 todos pierden
    //     if (NumeroApuestaRuleta == 0) {

    //         System.out.println("El numero de la ruleta es 0 todos lo jugadores descalificados");
    //         return;
    //     }

    //     // Modo numero concreto

    //     if (modoJuego.equals("numeroconcreto")) {

    //         if (this.numeroApuesta == NumeroApuestaRuleta) {

    //             saldo = saldo + 360;

    //             System.out.println("Jugador " + this.nombre + " ha ganado, + 360€ para su saldo");

    //         }
    //     }
    //     // fin modo numeroconcreto

    //     // Modo pares
    //     if (modoJuego.equals("pares")) {

    //         if (NumeroApuestaRuleta % 2 == 0 & numeroApuesta % 2 == 0 || NumeroApuestaRuleta % 2 != 0 & numeroApuesta % 2 != 0) {

    //             System.out.println("Ganador de pares");

    //             this.saldo += 20;


    //         } else {

    //             System.out.println("Perdiste pares ");
    //         }

    //     }
    //     // fin modo pares

    //     // Modo martingala
    //     if (modoJuego.equals("martingala")) {

    //         Boolean bucle = true;
    //         int cantidadApostar = 10;
    //         int contador = 1;

    //         while (bucle) {

    //             saldo = saldo - cantidadApostar;
    //             cantidadApostar = cantidadApostar * 2;

    //             if (NumeroApuestaRuleta == this.numeroApuesta) {

    //                 System.out.println("El apostador " + this.nombre + " ha ganado  360€ y deja el juego ");

    //                 saldo = saldo + 360;

    //                 return;

    //             }

    //             if (saldo < 0) {

    //                 bucle = false;
    //                 System.out.println("El apostador " + this.nombre + " se quedo sin dinero");
    //             }

    //             System.out.println("El apostador " + this.nombre + " no ha acertado en el intento nº " + contador
    //                     + " su saldo es " + saldo); 
                
    //             contador++;
    //         }


        // }
    // }
    // Fin modo martingala
}
