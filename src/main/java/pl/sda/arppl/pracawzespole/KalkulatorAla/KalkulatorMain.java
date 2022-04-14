package pl.sda.arppl.pracawzespole.KalkulatorAla;

import java.util.Scanner;
public class KalkulatorMain {
    public static void main(String[] args) {
        Kalkulator kalku1 = new Kalkulator();//definiuję zmienną kalku1 z klasy Kalkulator
        Scanner scanner = new Scanner(System.in);
        String pytanie = "tak";
        do{
            System.out.println("podaj pierwszą cyfrę");
            kalku1.setA(scanner.nextDouble());//odwołuję się do settera z utworzonej zmiennej kalku1 z klasy Kalkulator
            System.out.println("podaj druga cyfrę");
            kalku1.setB(scanner.nextDouble());
            kalku1.dodaj();
            kalku1.odejmij();
            kalku1.iloczyn();
            kalku1.iloraz();
            System.out.println("Czy kontynuować? ");
            Scanner scanner1 = new Scanner(System.in);
            pytanie = scanner1.next();
        } while (pytanie.equals("tak"));}}









