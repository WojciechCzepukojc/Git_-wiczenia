package pl.sda.arppl.pracawzespole;

public class Main {
    public static void main(String[] args) {

        int result = (int) (Math.random() * 6 + 1);
       switch (result) {
           case 1 :
               System.out.println("Wyrzucono wartość 1");
               break;
           case 2 :
               System.out.println("Wyrzucono wartość 2");
               break;
           case 3 :
               System.out.println("Wyrzucono wartość 3");
               break;
           case 4 :
               System.out.println("Wyrzucono wartość 4");
               break;
           case 5 :
               System.out.println("Wyrzucono wartość 5");
               break;
           case 6 :
               System.out.println("Wyrzucono wartość 6");
               break;
           default:
               System.out.println("Błąd albo kość zatrzymała się na kancie!");



       }



    }
}
