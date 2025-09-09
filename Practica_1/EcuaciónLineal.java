package Practica_1;

public class EcuaciónLineal {
    // Atributos privados
    private double a;
    private double b;
    private double c;

    // Constructor
    public EcuaciónLineal(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método que devuelve el discriminante
    public double getDiscriminante() {
        return (b * b) - (4 * a * c);
    }

    // Método que devuelve la primera raíz
    public double getRaiz1() {
        if (getDiscriminante() >= 0) {
            return (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        } else {
            return 0; // No hay raíz real
        }
    }

    // Método que devuelve la segunda raíz
    public double getRaiz2() {
        if (getDiscriminante() >= 0) {
            return (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        } else {
            return 0; // No hay raíz real
        }
    }
}
