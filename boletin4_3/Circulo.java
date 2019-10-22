
package boletin4_3;


public class Circulo {
    
    private double radio;
    private final double PI = 3.14;

    public Circulo() {
        radio = 0;
    }

    public Circulo(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double calcularArea() {
        double area = 2 * PI * Math.pow(radio, 2);
        return area;
    }

    public double calcularLongitud() {
        double longitud= 2 * PI * radio;
        return longitud;
    }

}

