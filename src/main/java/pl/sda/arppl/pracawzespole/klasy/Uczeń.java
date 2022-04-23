package pl.sda.arppl.pracawzespole.klasy;

public class Uczeń {
    private String imię;
    private String nazwisko;
    private String klasa;

    public Uczeń(String imię, String nazwisko, String klasa) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
    }

    public String getImię() {
        return imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }
    public void printUczeń(){
        System.out.println(String.format("Imię ucznia to: %s, jego nazwisko to: %s, uczeń chodzi do klasy: %s", imię,nazwisko,klasa));
    }
}
