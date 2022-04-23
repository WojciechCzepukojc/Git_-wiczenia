package pl.sda.arppl.pracawzespole.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        try {


            int liczba = scanner.nextInt();
            System.out.println(liczba);
        }catch (InputMismatchException e){
            System.out.println("Błędny format");
        }
    }
}
