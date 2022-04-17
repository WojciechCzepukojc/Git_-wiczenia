package pl.sda.arppl.pracawzespole.Figury;

public class Prostokąt {
    private int a;
    private int b;

    public double getPole(){
        this.a = a;
        this.b = b;
        return a * b;
    }
    public double getObwod(){
        this.a = a;
        this.b = b;
        return a + b + a + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
