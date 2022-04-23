package pl.sda.arppl.pracawzespole.wyjatki;

public class Szkoła {
    private String nazwa;
    private String [] uczniowie;


        public class Uczniowie{

        }
        public int liczbaUczniów() {
            return uczniowie.length;
    }

    public Szkoła(String nazwa, String[] uczniowie) {
        this.nazwa = nazwa;
        this.uczniowie = uczniowie;
    }
}
