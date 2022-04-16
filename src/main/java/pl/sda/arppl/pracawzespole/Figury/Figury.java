package pl.sda.arppl.pracawzespole.Figury;

public class Figury {
    public static void main(String[] args) {
        Trójkąt trojkat = new Trójkąt();
        Kwadrat kwadrat = new Kwadrat();


        trojkat.setA((int) (Math.random() * 10 + 1));
        trojkat.setB((int) (Math.random() * 10 + 1));
        trojkat.setC((int) (Math.random() * 10 + 1));
        kwadrat.setA((int) (Math.random() * 10 + 1));

        System.out.println("Trójkąt o bokach a: " + trojkat.getA() + ", b: " + trojkat.getB() + ", c: " + trojkat.getC());
        if (trojkat.isTrojkat()){
            System.out.println("Pole tego trójkąta to: " + trojkat.getPole());
            System.out.println("Obwód tego trójkąta to: " + trojkat.getObwod());
        }else {
            System.out.println("Tak naprawdę nie jest trójkątem");
        }

        System.out.println("Kwadrat o boku: " + kwadrat.getA());
        System.out.println("Pole tego kwadratu to: " + kwadrat.getPole());
        System.out.println("Obwód tego kwadratu to: " + kwadrat.getObwod());





    }
}
