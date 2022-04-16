package pl.sda.arppl.pracawzespole.Figury;

public class Kwadrat {
    private int a;

    public double getPole(){
        this.a = a;
        return a * a;
    }
    public double getObwod(){
        this.a = a;
        return a + a +a +a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
