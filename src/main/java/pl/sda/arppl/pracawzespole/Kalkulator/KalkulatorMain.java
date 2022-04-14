package pl.sda.arppl.pracawzespole.Kalkulator;

import java.util.Scanner;

public class KalkulatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Kalkulator kalkulator = new Kalkulator();

        String czyKontynuować = "tak";


        do{
            System.out.println("Podaj pierwszą liczbę: ");
            kalkulator.setLiczba1(scanner.nextInt());

            System.out.println("Podaj drugą liczbę: ");
            kalkulator.setLiczba2(scanner.nextInt());

            System.out.println("Podaj operator");
            kalkulator.setOperator(scanner.next());

            double wynik = Matematyka.wynik(kalkulator);

            System.out.println("Wynik: " + wynik);
            System.out.println("Czy kontynuować?");
            czyKontynuować = scanner.next();
        } while (czyKontynuować.equals("tak"));


    }
}
