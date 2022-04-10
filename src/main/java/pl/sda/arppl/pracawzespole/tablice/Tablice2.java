package pl.sda.arppl.pracawzespole.tablice;

import java.util.Scanner;

public class Tablice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               //wyświetl co drugi element tablicy

        int[] array = new int[5];

        for (int i = 0; i< array.length; i++){
            System.out.println("Podaj wartość elementu " + i);
            array[i] = scanner.nextInt();


        }
        for ( int i= 0; i< array.length; i++){
            if (i%2 == 0){
                System.out.print(array[i] + " ");
            }
        }

    }
}
