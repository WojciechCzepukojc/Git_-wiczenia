package pl.sda.arppl.pracawzespole.tablice;

import java.util.Scanner;

public class Tablice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // utwórz 4 elementową tablicę i dodaj wartości przy pomocy Scannera
        double [] tablica = new double[4];          // wyprintuj tablicę

        for (int i = 0; i< tablica.length; i++){
            System.out.println("Podaj wartość elementu " + i);
            tablica[i] = scanner.nextInt();
        }
        for (int i = 0; i< tablica.length; i++ ){
            System.out.print("|" + tablica[i] + "|" + " ");
        }




    }
}
