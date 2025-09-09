package Participacipacion_4;
public class PruebaMiEntero {
    public static void main(String[] args) {
        MiEntero num = new MiEntero(7);

        System.out.println("Valor: " + num.getValor());
        System.out.println("¿Es par? " + num.esPar());
        System.out.println("¿Es impar? " + num.esImpar());
        System.out.println("¿Es primo? " + num.esPrimo());

        System.out.println("¿5 es par? " + MiEntero.esPar(5));
        System.out.println("¿5 es primo? " + MiEntero.esPrimo(5));

        MiEntero otro = new MiEntero(7);
        System.out.println("¿num = otro? " + num.equals(otro));

        char[] arr = {'1', '2', '3'};
        System.out.println("Parse char[]: " + MiEntero.parseInt(arr));
        System.out.println("Parse String: " + MiEntero.parseInt("456"));
    }
}