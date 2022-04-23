package pl.sda.arppl.pracawzespole.czasIdata;

public class Grupasłow {



    public static void main(String[] args) {
        new Grupasłow().wypluj("maslo", "bulka","kwiatek","zupka");
    }

    void wypluj(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }}
