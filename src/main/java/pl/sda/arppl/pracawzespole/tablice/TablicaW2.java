package pl.sda.arppl.pracawzespole.tablice;

public class TablicaW2 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];

        for (int i = 0; i<array.length; i++){
            for (int j = 0; j< array.length; j++){
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++){
                if (array[i] == array[j]){
                    System.out.print("|" + array[i][j]+ "| ");
                }else {
                    System.out.print("|" + "##" + "|");
                }
            }
            System.out.println("");
        }
    }
}
