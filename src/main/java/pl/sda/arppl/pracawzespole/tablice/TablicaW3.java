package pl.sda.arppl.pracawzespole.tablice;

public class TablicaW3 {
    public static void main(String[] args) {
        int [][] array = new int[10][10];

        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i< array.length; i++){
            for (int j= 0; j<array.length; j++){
                if ((i == j) || (i+j) == array.length - 1){
                    System.out.print("| " + array[i][j] + " |");
                }else {
                    System.out.print("| * |");
                }
            }
            System.out.println("");
        }

    }
}
