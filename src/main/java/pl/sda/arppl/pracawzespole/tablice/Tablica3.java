package pl.sda.arppl.pracawzespole.tablice;

public class Tablica3 {
    public static void main(String[] args) {

        int[] array = new int[10];                      // przypisać wartości do tablicy 10 elementowej
        int j = 0;                                      // wygenerować losowo watości int od 0 do 10
                                                        // wyświetlić sumę wartości w tablicy

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            {
                ;
                System.out.print("|" + array[i] + "| ");
            }
        }
        System.out.println();
        for (int i = 0; i< array.length; i++){
            j += array[i];



        }System.out.println("Suma wszystkich wartości tablicy wynosi: " + j);
    }
}
