package pl.sda.arppl.pracawzespole.klasy;

public class OperacjeArytmetyczne {

    public static double obliczDlugosc(Point2d punkt1, Point2d punkt2) {
        int x1P1 = punkt1.getX1();
        int x2P1 = punkt1.getX2();
        int x1P2 = punkt2.getX1();
        int x2P2 = punkt2.getX2();
        int roznica1 = x1P2 - x1P1;
        int roznica2 = x2P2 - x2P1;
        double nawias1 = Math.pow(roznica1, 2);
        double nawias2 = Math.pow(roznica2, 2);
        return Math.sqrt(nawias1 + nawias2);
    }
}