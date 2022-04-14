package pl.sda.arppl.pracawzespole.Kalkulator;

public class Matematyka {

    public static double wynik(Kalkulator kalkulator){
        int l1 = kalkulator.getLiczba1();
        int l2 = kalkulator.getLiczba2();
        String o = kalkulator.getOperator();
        double a = 0;

        if (o.equals("+")) {
            a = l1 + l2;
        } else if (o.equals("-")){
            a = l1 - l2;
        }else if (o.equals("*")){
            a = l1 * l2;
        }else if (o.equals("/")){
            a = l1/l2;
        }else {
            System.out.println("Nieznany operator");
        }

        return a;
    }



}
