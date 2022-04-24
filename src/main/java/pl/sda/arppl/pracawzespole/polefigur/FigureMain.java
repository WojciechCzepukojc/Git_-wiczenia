package pl.sda.arppl.pracawzespole.polefigur;

public class FigureMain {
    public static void main(String[] args) throws NativeAreaException {


        Triangle równoboczny = new Triangle(6, 6, 6, 4);


        równoboczny.isItTriangle();
        System.out.println("Jego pole to: " + równoboczny.calculateArea());
        System.out.println("Jego obwód to: " + równoboczny.calculatePerimeter());



    }
}
