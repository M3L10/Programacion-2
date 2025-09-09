package Participacipacion_4;
public class MiEntero {
    private int valor;

    // Constructor
    public MiEntero(int valor) {
        this.valor = valor;
    }

    // Devuelve el valor
    public int getValor() {
        return valor;
    }

    // Métodos de instancia
    public boolean esPar() {
        return valor % 2 == 0;
    }

    public boolean esImpar() {
        return valor % 2 != 0;
    }

    public boolean esPrimo() {
        if (valor <= 1) return false;
        for (int i = 2; i <= valor / 2; i++) {
            if (valor % i == 0) return false;
        }
        return true;
    }

    // Métodos estáticos con int
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Métodos estáticos con MiEntero
    public static boolean esPar(MiEntero obj) {
        return obj.getValor() % 2 == 0;
    }

    public static boolean esImpar(MiEntero obj) {
        return obj.getValor() % 2 != 0;
    }

    public static boolean esPrimo(MiEntero obj) {
        return obj.esPrimo();
    }

    // Métodos equals
    public boolean equals(int n) {
        return valor == n;
    }

    public boolean equals(MiEntero obj) {
        return valor == obj.getValor();
    }

    // Métodos parse
    public static int parseInt(char[] arr) {
        return Integer.parseInt(new String(arr));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}