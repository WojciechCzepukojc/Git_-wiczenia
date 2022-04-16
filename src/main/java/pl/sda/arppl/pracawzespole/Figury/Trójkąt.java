package pl.sda.arppl.pracawzespole.Figury;

public class Trójkąt {
    private int a;
    private int b;
    private int c;





    public double h(){
        this.a = a;
        return (a * Math.sqrt(3)) / 2;
    }

    public double getPole(){
        this.a = a;
        return (a * h()) / 2;
    }

    public double getObwod(){
        this.a = a;
        this.b = b;
        this.c = c;
        return a + b + c;
    }

    public boolean isTrojkat(){
        this.a = a;
        this.b = b;
        this.c = c;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        }else {
            return false;

        }
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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
