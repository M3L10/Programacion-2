package Practica_2;
public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;

    // Constructor
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Métodos para obtener componentes
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Producto punto
    public double productoPunto(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }

    // Producto cruz
    public AlgebraVectorial productoCruz(AlgebraVectorial b) {
        double cx = this.y * b.z - this.z * b.y;
        double cy = this.z * b.x - this.x * b.z;
        double cz = this.x * b.y - this.y * b.x;
        return new AlgebraVectorial(cx, cy, cz);
    }

    // Norma (magnitud)
    public double norma() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Métodos para verificar perpendicularidad (sobrecargados)
    public boolean esPerpendicular1(AlgebraVectorial b) {
        return Math.abs(this.norma() + b.norma()) == Math.abs(this.norma() - b.norma());
    }

    public boolean esPerpendicular2(AlgebraVectorial b) {
        return Math.abs(this.norma() - b.norma()) == Math.abs(b.norma() - this.norma());
    }

    public boolean esPerpendicular3(AlgebraVectorial b) {
        return this.productoPunto(b) == 0;
    }

    public boolean esPerpendicular4(AlgebraVectorial b) {
        double suma = Math.pow(this.norma() + b.norma(), 2);
        double cuadrados = Math.pow(this.norma(), 2) + Math.pow(b.norma(), 2);
        return suma == cuadrados;
    }

    // Métodos para verificar paralelismo
    public boolean esParalelo1(AlgebraVectorial b) {
        return (this.x / b.x) == (this.y / b.y) && (this.y / b.y) == (this.z / b.z);
    }

    public boolean esParalelo2(AlgebraVectorial b) {
        AlgebraVectorial cruz = this.productoCruz(b);
        return cruz.x == 0 && cruz.y == 0 && cruz.z == 0;
    }

    // Proyección de a sobre b
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double escalar = this.productoPunto(b) / Math.pow(b.norma(), 2);
        return new AlgebraVectorial(escalar * b.x, escalar * b.y, escalar * b.z);
    }

    // Componente de a en la dirección de b
    public double componenteEn(AlgebraVectorial b) {
        return this.productoPunto(b) / b.norma();
    }
}
