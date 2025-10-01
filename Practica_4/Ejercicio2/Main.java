package Practica_4.Ejercicio2;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Figura[] figuras=new Figura[5];
        Random rand=new Random();
        for (int i=0;i<figuras.length;i++) {
            if (rand.nextInt(2)==0){ 
                figuras[i]=new Cuadrado("Rojo",1+rand.nextInt(10));
            } else {
                figuras[i]=new Circulo("Azul",1+rand.nextInt(10));}
        }
        for (Figura f : figuras) {
            System.out.println(f);
            System.out.println("Área: "+f.area());
            System.out.println("Perímetro: "+f.perimetro());
            if (f instanceof Coloreado) {
                System.out.println(((Coloreado) f).comoColorear());}
            System.out.println();}
    }
}