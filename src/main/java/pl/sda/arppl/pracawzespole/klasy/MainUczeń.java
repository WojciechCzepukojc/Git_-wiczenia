package pl.sda.arppl.pracawzespole.klasy;

public class MainUczeń {
    public static void main(String[] args) {
        Uczeń uczen1 = new Uczeń("Adam", "Mickiewicz", "IIc" );
        Uczeń uczen2 = new Uczeń("Maria", "Konopnicka", "Va");


        uczen1.printUczeń();
        uczen2.printUczeń();
    }
}
