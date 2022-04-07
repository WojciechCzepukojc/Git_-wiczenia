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
}
