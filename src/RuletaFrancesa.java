public class RuletaFrancesa {

    int numeroRuleta;

    public int SacarNumeroRuleta() {

        numeroRuleta = 3;

        return numeroRuleta;
        // (int)(Math.random() * 36);
    }

    public int esperarTiempo() {

        return (int) (Math.random() * 3000);

    }

    public void Apostar(String modoJuego, Apostador apostador) {

        SacarNumeroRuleta();

        // Si es 0 todos pierden

        if (numeroRuleta == 0) {

            System.out.println("El numero de la ruleta es 0 todos lo jugadores descalificados");
            return;
        }

        // Modo juego NumeroConcreto

        if (modoJuego.toLowerCase().equals("numeroconcreto")) {

            ApuestaNumeroConcreto(apostador);
        }
        // Fin del juego NumeroConcreto

        // Modo juego pares

        // fin del juego pares

        if (modoJuego.toLowerCase().equals("pares")) {

            ApuestaPares(apostador);

        }
        // Modo martingala
        if (modoJuego.toLowerCase().equals("martingala")) {

            Boolean bucle = true;
            int cantidadApostar = 10;
            int contador = 1;

            while (bucle) {

                apostador.restarSaldo(cantidadApostar);
                cantidadApostar = cantidadApostar * 2;

                if (numeroRuleta == apostador.getNumeroApuesta()) {

                    System.out.println("El apostador " + apostador.getNombre() + " ha ganado  360$ y deja el juego ");

                    apostador.sumarSaldo(360);

                    return;

                }

                if (apostador.getSaldo() < 0) {

                    bucle = false;
                    System.out.println("El apostador " + apostador.getNombre() + " se quedo sin dinero");
                }

                System.out.println(
                        "El apostador " + apostador.getNombre() + " no ha acertado en el intento nº " + contador
                                + " su saldo es " + apostador.getSaldo());

                contador++;
            }

        }
    }

    public void ApuestaNumeroConcreto(Apostador apostador) {

        if (apostador.getNumeroApuesta() == numeroRuleta) {

            apostador.sumarSaldo(360);

            System.out.println("Jugador " + apostador.getNombre() + " ha ganado 360$ para su saldo");

        } else {

            System.out.println("Jugador " + apostador.getNombre() + " ha perdido, eligio el numero "
                    + apostador.getNumeroApuesta() + " y la ruleta eligio " + numeroRuleta);
        }

    }

    public void ApuestaPares(Apostador apostador) {

        if (numeroRuleta % 2 == 0 & apostador.getNumeroApuesta() % 2 == 0
                || numeroRuleta % 2 != 0 & numeroRuleta % 2 != 0) {

            System.out.println("Ganador de pares");

            apostador.sumarSaldo(20);

        } else {

            System.out.println("Perdiste pares ");
        }

    }
}