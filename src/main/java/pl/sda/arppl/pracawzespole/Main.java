package pl.sda.arppl.pracawzespole;

public class Main {
    public static void main(String[] args) {

        int godzina = (int) (Math.random() * 24 + 1);
        int dzienTygodnia = (int) (Math.random() * 7 + 1);
        int dzienMiesiaca = (int) (Math.random() * 31 + 1);
        int miesiac = (int) (Math.random() * 12 + 1);

        System.out.println("Aktualnie mamy godzinę " + godzina);

            if (godzina >= 6 && godzina <= 11) {
                System.out.println("Mamy rano");
            }else if (godzina == 12){
                System.out.println("Mamy południe");
            }else if (godzina >= 13 && godzina <= 17) {
                System.out.println("Mamy popołudnie");
            }else if (godzina >= 18 && godzina <= 21) {
                System.out.println("Mamy wieczór");
            }else{
                System.out.println("Mamy noc");
            }

        switch (dzienTygodnia){
            case 1 :
                System.out.println("Dziś jest poniedziałek");
                ;break;
            case 2 :
                System.out.println("Dziś jest wtorek");
                ;break;
            case 3 :
                System.out.println("Dziś jest środa");
                ;break;
            case 4 :
                System.out.println("Dziś jest czwartek");
                ;break;
            case 5 :
                System.out.println("Dziś jest piątek");
                ;break;
            case 6 :
                System.out.println("Dziś jest sobota");
                ;break;
            case 7 :
                System.out.println("Dziś jest niedziela");
                ;break;
        }

            if (dzienMiesiaca >= 25 && dzienMiesiaca <= 31){
                System.out.println("Jestem po wypłacie");
            }else {
                System.out.println("Jestem przed wypłatą");
            }

        switch (miesiac){
            case 1:
            case 2:
            case 3:
                System.out.println("Mamy zimę");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Mamy wiosnę");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("Mamy lato");
                break;
            case 10 :
            case 11 :
            case 12 :
                System.out.println("Mamy jesień");
                break;
        }











    }
}
