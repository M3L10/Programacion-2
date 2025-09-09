package Practica_1;
import java.util.Scanner;
import java.util.Locale;
public class TestEcuacion {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        while (true) {
            System.out.print("");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("")) {
                break;
            }
            input = input.replace(',', '.');

            try {
                String[] valores = input.split("\\s+");
                if (valores.length != 6) {
                    System.out.println("");
                    continue;
                }

                double a = Double.parseDouble(valores[0]);
                double b = Double.parseDouble(valores[1]);
                double c = Double.parseDouble(valores[2]);
                double d = Double.parseDouble(valores[3]);
                double e = Double.parseDouble(valores[4]);
                double f = Double.parseDouble(valores[5]);

                EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

                if (ecuacion.tieneSolucion()) {
                    System.out.printf("x = %.1f, y = %.1f%n", ecuacion.getX(), ecuacion.getY());
                } else {
                    System.out.println("La ecuación no tiene solución.");
                }
            } catch (NumberFormatException ex) {
                System.out.println("");
            }
        }

        // Cerrar el Scanner
        scanner.close();
        System.out.println("Programa terminado.");


	}

}
