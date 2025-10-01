package Practica_4.Ejercicio2;

public abstract class Figura {
    private String color;
    public Figura(String color) {
        this.color=color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public String getColor() {
        return this.color;
    }
    @Override
    public String toString() {
        return "Figura de color: "+color;
    }
    public abstract double area();
    public abstract double perimetro();
}