package pl.sda.arppl.pracawzespole.ZadaniePoint2D;

import pl.sda.arppl.pracawzespole.klasy.Point2d;

public class Obliczenia {

    public static double obliczDługość(Point2D point1, Point2D point2){
        int x1P1 = point1.getX1();
        int x2P1 = point1.getX2();
        int x1P2 = point2.getX1();
        int x2P2 = point2.getX2();
        int roznica1 = x1P2 - x1P1;
        int roznica2 = x2P2 - x2P1;
        double nawias1 = Math.pow(roznica1, 2);
        double nawias2 = Math.pow(roznica2, 2);
        return Math.sqrt(nawias1 + nawias2);

}
}
