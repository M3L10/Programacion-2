package Practica_1;

import java.util.Scanner;
import java.util.Locale;
public class TestEstadistica {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double[] numeros = new double[10];

        // Solicitar los datos al usuario
        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        // Crear objeto Estadistica
        Estadistica estadistica = new Estadistica(numeros);

        // Calcular y mostrar resultados
        System.out.printf("El promedio es %.2f%n", estadistica.promedio());
        System.out.printf("La desviación estándar es %.6f%n", estadistica.desviacion());

        sc.close();
    }
}
