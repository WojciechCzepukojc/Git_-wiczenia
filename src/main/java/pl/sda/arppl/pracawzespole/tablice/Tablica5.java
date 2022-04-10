package pl.sda.arppl.pracawzespole.tablice;

import java.util.Scanner;

public class Tablica5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        //wczytanie elementów typu string do tablicy 1
                                                        //przypisanie tych samych elementów do tablicy 2
        String[] tablica1 = new String[4];              // w odwrotnej kolejności
        String[] tablica2 = new String[4];              //wyprintowanie

        for (int i = 0; i<tablica1.length; i++){
            System.out.println("Podaj imię: " + i);
            tablica1[i] = scanner.next();
        }
        for (int i = 0; i< tablica1.length; i++){
            tablica2[i] = tablica1[tablica1.length -i -1];
        }
        for (int i = 0; i<tablica1.length; i++){
            System.out.print("|" + tablica1[i] + "| ");
        }
        System.out.println();
        for (int i = 0; i < tablica1.length; i++){
            System.out.print("|" + tablica2[i] + "| ");
        }
    }
}
