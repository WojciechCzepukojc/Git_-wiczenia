package pl.sda.arppl.pracawzespole.Stringi;

import java.util.Locale;
import java.util.Scanner;

public class ZadString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ciąg = null;

        do {
            System.out.println("Podaj ciąg znaków: ");
            ciąg = scanner.next();
            System.out.println(ciąg);
            System.out.println(ciąg.toLowerCase());
            System.out.println(ciąg.replace("a", "z"));
            System.out.println(ciąg.contains("java"));
            System.out.println(ciąg.toUpperCase());
            System.out.println(ciąg.equals("JAVA"));

        }while (ciąg.length()>=5);



    }
}
