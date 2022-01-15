package figuras;

public class Circunferencia {
    private double radio;
    private String color;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void imprimir() {
        color = "rojo";
        double d = 2 * radio;
        System.out.println("Di�metro: " + d);
        System.out.println("Color: " + color);
        double area = calcularArea();
        System.out.println(area);
    }

    private double calcularArea() {
        double PI = 3.1416;
        double area = 2 * PI * radio * radio;
        return area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }
}

