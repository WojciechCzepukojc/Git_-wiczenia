package pl.sda.arppl.pracawzespole.czasIdata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Data {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate =localDate.plusYears(1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        System.out.println("Data formated: " + localDate.format(dtf));

    }
}
