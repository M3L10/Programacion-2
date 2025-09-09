package Practica_1;
class Estadistica {
    private double[] datos; // Arreglo para los datos

    // Constructor
    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    // Método para calcular el promedio
    public double promedio() {
        double suma = 0;
        for (double valor : datos) {
            suma += valor;
        }
        return suma / datos.length;
    }

    // Método para calcular la desviación estándar
    public double desviacion() {
        double media = promedio();
        double suma = 0;
        for (double valor : datos) {
            suma += Math.pow(valor - media, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}