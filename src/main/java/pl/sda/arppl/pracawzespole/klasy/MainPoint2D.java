package pl.sda.arppl.pracawzespole.klasy;

import java.text.DecimalFormat;

public class MainPoint2D {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double wynik;

        Point2d punkt1 = new Point2d(4, 5);
        Point2d punkt2 = new Point2d(7, 8);

        wynik = OperacjeArytmetyczne.obliczDlugosc(punkt1,punkt2);

        System.out.println(df.format(wynik));

    }
}