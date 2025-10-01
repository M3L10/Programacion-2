package Practica_3;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    // b) atributo pedido
    private int numeroAAdivinar; 

    // c) constructor que recibe el número de vidas (pasa al constructor padre)
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    // d) método juega con la implementación pedida
    public void juega() {
        // 1) llama a reiniciaPartida
        reiniciaPartida();

        // 2) genera aleatoriamente el numero a adivinar entre 0 y 10
        Random ra = new Random();
        this.numeroAAdivinar = ra.nextInt(11); 
        // 3) muestra mensaje pidiendo al usuario que adivine
        System.out.println("Adivina un número entre 0 y 10.");

        // 4) lee un entero y lo compara
        Scanner te = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce tu intento: ");
            while (!te.hasNextInt()) {
                System.out.print("Por favor introduce un número entero (0-10): ");
                te.next();
            }
            int intento = te.nextInt();

            if (intento == this.numeroAAdivinar) {
                // a' Si es igual
                System.out.println("¡Acertaste!!");
                actualizaRecord();
                return;
            } else {
                // b' Si es diferente, llama a quitaVida heredado
                boolean quedan = quitaVida();
                if (quedan) {
                    // c' quedan vidas: indicamos mayor/menor y que lo intente de nuevo
                    if (intento < this.numeroAAdivinar) {
                        System.out.println("El número es mayor. Intenta otra vez.");
                    } else {
                        System.out.println("El número es menor. Intenta otra vez.");
                    }
                } else {
                    // d' no quedan vidas: se sale del método juega
                    System.out.println("No te quedan vidas. Fin del juego. El número era: "
                            + this.numeroAAdivinar);
                    return;
                }
            }
        }
    }
}
