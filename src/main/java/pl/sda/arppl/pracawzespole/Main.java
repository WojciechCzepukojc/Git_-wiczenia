package pl.sda.arppl.pracawzespole;

public class Main {
    public static void main(String[] args) {

        int result = (int) (Math.random() * 6 + 1);
       switch (result) {
           case 1 :
           case 3 :
           case 5 :
               System.out.println("Wyrzucono nieparzystą liczbę oczek");
               break;
           case 2 :
           case 4 :

               System.out.println("Wyrzucono parzystą liczbę oczek");
               break;
           case 6 :
               System.out.println("Wyrzucono parzystą liczbę oczek");
               System.out.println("WYGRALES");
               break;
           default:
               System.out.println("Jesteś najebany, rzuć jeszcze raz" );



       }



    }
}
