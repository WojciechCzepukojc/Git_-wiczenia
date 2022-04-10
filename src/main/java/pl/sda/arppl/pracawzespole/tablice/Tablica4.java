package pl.sda.arppl.pracawzespole.tablice;

import java.util.Scanner;

public class Tablica4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tablica1 = new String[4];              //wczytanie elementów typu string do tablicy 1
        String[] tablica2 = new String[4];              //przypisanie tych samych elementów do tablicy 2
                                                        //wyprintowanie
        for (int i = 0; i<tablica1.length; i++){
            System.out.println("Podaj imię " + i);
            tablica1[i] = scanner.next();
        }
        for (int i = 0; i< tablica1.length; i++) {
            tablica2[i] = tablica1[i];
        }
        for (int i = 0; i<tablica1.length; i++) {
            System.out.print("|" + tablica1[i] + "| ");
        }
        System.out.println();
        for (int i = 0; i< tablica1.length; i++){
            System.out.print("|" + tablica2[i] + "| ");
        }
    }
}
