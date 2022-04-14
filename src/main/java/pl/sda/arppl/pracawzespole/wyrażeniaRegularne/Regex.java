package pl.sda.arppl.pracawzespole.wyrażeniaRegularne;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nrDomu = scanner.next();


        Pattern pattern = Pattern.compile([1-9]);
        Matcher matcher = pattern.matcher(nrDomu);
    }
}
