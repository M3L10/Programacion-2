package Practica_3;

import java.util.Random;

public class Juego {
    protected int numeroDeVidas; // número de vidas actuales
    protected int record;        // mejor record (vidas restantes más alto)
    protected int vidasIniciales;

    //a) Constructor que inicializa vidas y record
    public Juego(int numeroDeVidasInicial) {
        this.numeroDeVidas = numeroDeVidasInicial;
        this.vidasIniciales = numeroDeVidasInicial;
        this.record = 0;
    }

    // b) reiniciaPartida
    public void reiniciaPartida() {
        this.numeroDeVidas = this.vidasIniciales;
        System.out.println("Partida reiniciada. Vidas: " + this.numeroDeVidas);
    }

    // c) actualizaRecord
    public void actualizaRecord() {
        if (this.numeroDeVidas > this.record) {
            this.record = this.numeroDeVidas;
            System.out.println("¡Nuevo record! record = " + this.record);
        } else {
            System.out.println("No se superó el record actual (" + this.record + ").");
        }
    }

    // d) quitaVida: disminuye una vida y devuelve true si quedan vidas, false si ya no quedan
    public boolean quitaVida() {
        this.numeroDeVidas = this.numeroDeVidas - 1;
        System.out.println("Te quedan " + this.numeroDeVidas + " vidas.");
        return this.numeroDeVidas > 0;
    }
}

