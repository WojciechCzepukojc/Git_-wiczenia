package pl.sda.arppl.pracawzespole.polefigur;

public class Triangle extends AbstractFigure{

private int a;
private int b;
private int c;
private int h;

    @Override
    public double calculatePerimeter() throws NativeAreaException {

        if (getA()<0 || getB()<0 || getC()<0 || getH()<0){
            throw new NativeAreaException("Błędna wartość pola");
        }
        return getA() + getB() + getC();
    }

    @Override
    public double calculateArea() throws NativeAreaException {
        return (getA() * getH()) / 2;
    }



    public void isItTriangle(){

        if ((getA() + getB())>getC() && (getA() + getC()> getB() && (getB() + getC()>getA()))){
            System.out.println("To jest trójkąt");

        }else{
            System.out.println("To nie jest trójkąt");
        }


    }



    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.figureType = FigureType.TRIANGLE;
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

    public int getH() {
        return h;
    }
}
