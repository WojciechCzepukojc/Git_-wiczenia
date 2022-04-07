package pl.sda.arppl.pracawzespole;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid(){
        if ((a + b) > c && (a + c) >b && (b + c) > a) {
            return true;
        }else {
            return false;
        }
    }

    public double getField(){
        double p = (a + b + c) / 2; //wzór Herona
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getPerimeter(){
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
