package Practica_2;
public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(2, 3, 4);
        AlgebraVectorial b = new AlgebraVectorial(1, 0, 0);

        System.out.println("Producto punto: " + a.productoPunto(b));
        System.out.println("Producto cruz: (" + a.productoCruz(b).getX() + ", "
                                            + a.productoCruz(b).getY() + ", "
                                            + a.productoCruz(b).getZ() + ")");

        System.out.println("¿a es perpendicular a b?: " + a.esPerpendicular3(b));
        System.out.println("¿a es paralelo a b?: " + a.esParalelo2(b));

        AlgebraVectorial proy = a.proyeccionSobre(b);
        System.out.println("Proyección de a sobre b: (" + proy.getX() + ", "
                                                    + proy.getY() + ", "
                                                    + proy.getZ() + ")");

        System.out.println("Componente de a en b: " + a.componenteEn(b));
    }
}
