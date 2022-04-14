package pl.sda.arppl.pracawzespole.Stringi;

import java.util.Scanner;

public class ZadString2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("napisz cos ");
        String txt = scanner.nextLine();
        int ilePowtorzen = 0;
        int dlugosc = txt.length();
        char lastchar = txt.charAt(dlugosc-1);


        for(int i = 0; i<txt.length(); i++)
        {if(txt.charAt(i)==lastchar)
            ilePowtorzen++;}
        System.out.println(ilePowtorzen);
    }}


