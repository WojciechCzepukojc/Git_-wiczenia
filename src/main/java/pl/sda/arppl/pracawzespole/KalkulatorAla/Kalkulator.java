package pl.sda.arppl.pracawzespole.KalkulatorAla;

import java.util.Scanner;
//deklaracja klasy z modyfikatorem('akcesor') public, oznacza to że kod jest dostępny do wszystkich klas
public class Kalkulator {
    //pola(atrybuty) klasy z modyfikatorem dostępu private, oznacza, że kod jest dostępny tylko w zadeklarowanej klasie
    private double a;
    private double b;
    //deklaracja konstruktora domyślnego. Tak na prawdę nie jest on potrzebny
    //public Kalkulator() {}
//deklaruję metodę (operacje), metoda nie bedzie wyrzucała żadnej wartości, będzie można jej użyć również w innych klasach
    public void dodaj(){
        System.out.println(a+b);
    }
    public  void odejmij(){
        System.out.println(a-b);
    }
    public  void iloczyn(){
        System.out.println(a*b);
    }
    public  void iloraz(){
        System.out.println(a/b);
    }
    //settery (mutatory) służą do pobierania/zmieniania wartości pól klasy poza tą klasą, settery są też metodą
    public void setA(double a) {
        this.a = a;}
    public void setB(double b) {
        this.b = b;}
    public void setOperacja(String operacja) {
    }
    //getery to pośrednicy to wyrzucania iformacji, jakbym chciała w innej klasie wyrzuć na ekran wartosć pola A
    public double getA() {
        return a;}
    public double getB() {
        return b;}
}