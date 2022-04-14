package pl.sda.arppl.pracawzespole.ZadaniePoint2D;

import java.text.DecimalFormat;

public class MainPoint2D {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double wynik = 0;

        Point2D point1 = new Point2D(7,9);
        Point2D point2 = new Point2D(4,6);

        wynik = Obliczenia.obliczDługość(point1, point2);

        System.out.println(df.format(wynik));
    }
}
