package pl.sda.arppl.pracawzespole.tablice;

public class TablicaW1 {
    public static void main(String[] args) {
        int [][] tablica = new int[4][4];

        for (int i = 0; i<tablica.length; i++){
            for (int j = 0; j<tablica.length; j++){
                tablica[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i< tablica.length; i++){
            for (int j = 0; j < tablica.length; j++){
                System.out.print("|" + tablica[i][j] + "| ");
            }
            System.out.println("");
        }

    }
}
