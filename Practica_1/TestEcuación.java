package Practica_1;

import java.util.Scanner;
import java.util.Locale;
public class TestEcuación {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            EcuacionLineal eq = new EcuaciónLineal(a, b, c);
            double discriminante = eq.getDiscriminante();

            if (discriminante > 0) {
                System.out.println("La ecuación tiene dos raíces " + eq.getRaiz1() + " y " + eq.getRaiz2());
            } else if (discriminante == 0) {
                System.out.println("La ecuación tiene una raíz " + eq.getRaiz1());
            } else {
                System.out.println("La ecuación no tiene raíces reales");
            }
        }

        sc.close();
    }
}