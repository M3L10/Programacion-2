package Practica_2;
public class TestVector3D {
    public static void main(String[] args) {
        // Crear vectores
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, 0, -1);

        // Operaciones
        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);

        System.out.println("\nSuma: a + b = " + a.suma(b));
        System.out.println("Multiplicación escalar (3 * a) = " + a.escalar(3));
        System.out.println("Longitud de a = " + a.longitud());
        System.out.println("Normal de a = " + a.normalizar());
        System.out.println("Producto escalar a·b = " + a.productoEscalar(b));
        System.out.println("Producto vectorial a x b = " + a.productoVectorial(b));
        System.out.println("Proyección de a sobre b = " + a.proyeccion(b));
    }
}

