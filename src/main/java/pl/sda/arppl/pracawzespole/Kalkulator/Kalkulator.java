package pl.sda.arppl.pracawzespole.Kalkulator;

public class Kalkulator {
    private int liczba1;
    private int liczba2;
    private String operator = "";




    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getLiczba1() {
        return liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public String getOperator() {
        return operator;
    }
}
