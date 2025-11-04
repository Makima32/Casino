# 🎰 Proyecto: Casino - Ruleta Francesa Multijugador

Este proyecto simula un **casino de ruleta francesa** en Java, donde varios jugadores (apostadores) participan simultáneamente en distintas modalidades de juego.  
Se ha implementado el uso de **hilos (`Runnable`)** para simular las apuestas concurrentes de varios jugadores a la vez.

---

## Descripción del proyecto

Cada jugador (`Apostador`) apuesta en un **modo de juego** determinado:
-  **Número concreto** → gana si acierta exactamente el número de la ruleta.
-  **Pares e impares** → gana si elige la paridad correcta.
-  **Martingala** → sistema progresivo que duplica la apuesta tras cada pérdida hasta ganar.

La **banca** (`Banca`) gestiona el dinero total del casino, y el **casino** (`Casino`) coordina el juego utilizando la **ruleta francesa** (`RuletaFrancesa`).

---


