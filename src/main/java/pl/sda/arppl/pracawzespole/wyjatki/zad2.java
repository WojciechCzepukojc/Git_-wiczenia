package pl.sda.arppl.pracawzespole.wyjatki;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj licznik");
        int licznik = scanner.nextInt();
        System.out.println("Podaj mianownik");
        double wynik = 0.0;
        int mianownik = scanner.nextInt();
        try {


            wynik = licznik / mianownik;
        }catch (ArithmeticException e){
            System.out.println("Mianownik nie może być zerem");
        }
        System.out.println(wynik);

    }
}
