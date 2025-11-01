public class RuletaFrancesa {

    int numeroRuleta;
    int tiempo;

    public int SacarNumeroRuleta() {


        numeroRuleta = (int)(Math.random() * 36);

        return numeroRuleta;
    }

    public void CrupierTira(int tiempoAEsperar) {

        esperarTiempo(tiempoAEsperar);

        SacarNumeroRuleta();

    }

    public void esperarTiempo(int tiempoAesperar) {

        try {

            Thread.currentThread();
            Thread.sleep(tiempoAesperar);
        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

    public void Apostar(String modoJuego, Apostador apostador) {

        if (apostador.getSaldo() <= 0) {

            apostador.setGambling(false );
            System.out.println(
                    "El apostador " + apostador.getNombre() + " no tiene suficiente dinero para seguir apostando y ahora tiene una deuda de " + apostador.getSaldo() +"$");
        }

        if (apostador.isGambling()) {

            SacarNumeroRuleta();

            // Si es 0 todos pierden

            if (numeroRuleta == 0) {

                System.out.println("El numero de la ruleta es 0 todos los jugadores descalificados");

                System.exit(1);

            }

            // Modo numero concreto
            if (modoJuego.toLowerCase().equals("numeroconcreto")) {

                ApuestaNumeroConcreto(apostador);
            }

            // Modo pares
            if (modoJuego.toLowerCase().equals("pares")) {

                ApuestaPares(apostador);

            }
            // Modo martingala
            if (modoJuego.toLowerCase().equals("martingala")) {

                ApuestaMartingala(apostador);

            }
        }
    }

    public void ApuestaNumeroConcreto(Apostador apostador) {

        apostador.restarSaldo(10);
        if (apostador.getNumeroApuesta() == numeroRuleta) {

            apostador.sumarSaldo(360);

            System.out.println("Jugador " + apostador.getNombre() + " ha ganado 360$ para su saldo y ahora tiene "
                    + apostador.getSaldo() + "$" + "\n");

        } else {

            System.out.println("Jugador " + apostador.getNombre() + " ha perdido, eligio el numero "
                    + apostador.getNumeroApuesta() + " y la ruleta eligio " + numeroRuleta + " , " + apostador.getNombre() + " tiene ahora " + apostador.getSaldo() + "$" +  "\n");

                }

    }

    //Preguntar al profe por los sout no ando seguro si poner si la maquina saco pares o directamente poner si el jugador gano 
    public void ApuestaPares(Apostador apostador) {
        String parOImpar;
        String parOImparjugador;

        apostador.restarSaldo(10);

        if (numeroRuleta % 2 == 0  ) {
            parOImpar = "par";
        }else{
            parOImpar = "impar";
        }

        if (apostador.getNumeroApuesta() % 2 == 0) {
        
            parOImparjugador ="par";
        }else{
            parOImparjugador ="impar";
        }

        if (numeroRuleta % 2 == 0 & apostador.getNumeroApuesta() % 2 == 0
                || numeroRuleta % 2 != 0 & apostador.getNumeroApuesta() % 2 != 0) {

            apostador.sumarSaldo(20);

            System.out.println("La maquina saco " + parOImpar + " el jugador " + apostador.getNombre() + " saco " + parOImparjugador + ", el jugador ha ganado 20$ y ahora tiene "
                    + apostador.getSaldo() +"$" + "\n");

        } else {

            System.out.println("La maquina saco " + parOImpar + " el jugador " + apostador.getNombre() + " saco " + parOImparjugador +", el jugador ha perdido 10$" + " ahora tiene " + apostador.getSaldo() + "$" + "\n");
        }

    }

    public void ApuestaMartingala(Apostador apostador) {

        Boolean bucle = true;
        int cantidadApostar = 10;
        int contador = 1;

        while (bucle) {

            this.esperarTiempo(2000);
            apostador.restarSaldo(cantidadApostar);
            cantidadApostar = cantidadApostar * 2;

            if (numeroRuleta == apostador.getNumeroApuesta()) {

                apostador.sumarSaldo(360);

                System.out.println("El apostador " + apostador.getNombre()
                        + " ha ganado  360$ y deja el juego, ahora tiene " + apostador.getSaldo() +"$" +  "\n");

                return;

            }

            if (apostador.getSaldo() < 0) {

                bucle = false;
                System.out.println("El apostador " + apostador.getNombre() + " se quedo sin dinero y con una deuda de "
                        + apostador.getSaldo() + "\n");
            }

            System.out.println(
                    "El apostador " + apostador.getNombre() + " no ha acertado en el intento nº " + contador
                            + " su saldo es " + apostador.getSaldo()+ "$" + "\n");

            contador++;
        }
    }
}