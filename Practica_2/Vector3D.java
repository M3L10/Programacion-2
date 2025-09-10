package Practica_2;
public class Vector3D {
    private double x;
    private double y;
    private double z;

    // Constructor
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Suma de vectores
    public Vector3D suma(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    // Multiplicación por escalar
    public Vector3D escalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }

    // Longitud del vector
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Normalización del vector
    public Vector3D normalizar() {
        double m = this.longitud();
        if (m == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(this.x / m, this.y / m, this.z / m);
    }

    // Producto escalar (dot product)
    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    // Producto vectorial (cross product)
    public Vector3D productoVectorial(Vector3D v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector3D(cx, cy, cz);
    }

    // Proyección de a sobre b
    public Vector3D proyeccion(Vector3D b) {
        double escalar = this.productoEscalar(b) / (b.longitud() * b.longitud());
        return b.escalar(escalar);
    }

    // Mostrar vector
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

