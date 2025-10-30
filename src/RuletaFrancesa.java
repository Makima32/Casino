public class RuletaFrancesa {

    int numeroRuleta;
    int tiempo;
    public int SacarNumeroRuleta() {

        numeroRuleta = 3;

        return numeroRuleta;
        // (int)(Math.random() * 36);
    }

    public  void esperarTiempo() {

    try {
        
        Thread.currentThread().sleep((int)(Math.random() * 3000));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }

    public void Apostar(String modoJuego, Apostador apostador) {

        SacarNumeroRuleta();

       
            
        // Si es 0 todos pierden

        if (numeroRuleta == 0) {

            System.out.println("El numero de la ruleta es 0 todos lo jugadores descalificados");
            return;
        }

        //Modo numero concreto
        if (modoJuego.toLowerCase().equals("numeroconcreto")) {

            ApuestaNumeroConcreto(apostador);
        }
      
        //Modo pares
        if (modoJuego.toLowerCase().equals("pares")) {

            ApuestaPares(apostador);

        }
        // Modo martingala
        if (modoJuego.toLowerCase().equals("martingala")) {

            ApuestaMartingala(apostador);

        

        }
    }

    public void ApuestaNumeroConcreto(Apostador apostador) {

        apostador.restarSaldo(10);
        if (apostador.getNumeroApuesta() == numeroRuleta) {

            apostador.sumarSaldo(360);

            System.out.println("Jugador " + apostador.getNombre() + " ha ganado 360$ para su saldo y ahora tiene " + apostador.getSaldo());

        } else {

            System.out.println("Jugador " + apostador.getNombre() + " ha perdido, eligio el numero "
                    + apostador.getNumeroApuesta() + " y la ruleta eligio " + numeroRuleta);
        }

    }

    public void ApuestaPares(Apostador apostador) {

       apostador.restarSaldo(10);

        if (numeroRuleta % 2 == 0 & apostador.getNumeroApuesta() % 2 == 0
                || numeroRuleta % 2 != 0 & apostador.getNumeroApuesta() % 2 != 0) {

            apostador.sumarSaldo(20);

            System.out.println("Jugador" + apostador.getNombre() +  "ha ganado 20$ para su saldo y ahora tiene " + apostador.getSaldo());


        } else {

            System.out.println("Jugador " + apostador.getNombre() + " ha perdido");
        }

    }

    public void ApuestaMartingala(Apostador apostador) {
        
            Boolean bucle = true;
            int cantidadApostar = 10;
            int contador = 1;

            while (bucle) {

                apostador.restarSaldo(cantidadApostar); 
                cantidadApostar = cantidadApostar * 2;

                if (numeroRuleta == apostador.getNumeroApuesta()) {

                    apostador.sumarSaldo(360);

                    System.out.println("El apostador " + apostador.getNombre()  + " ha ganado  360$ y deja el juego, ahora tiene " + apostador.getSaldo());


                    return;

                }

                if (apostador.getSaldo() < 0) {

                    bucle = false;
                    System.out.println("El apostador " + apostador.getNombre() + " se quedo sin dinero y con una deuda de " +apostador.getSaldo());
                }

                System.out.println(
                        "El apostador " + apostador.getNombre() + " no ha acertado en el intento nº " + contador
                                + " su saldo es " + apostador.getSaldo());

                contador++;
            }
    }
}