package pl.sda.arppl.pracawzespole.czasIdata;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Czas {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Now is the time: " + localTime);
        System.out.println("Added hours: " + localTime.plusHours(2));
        System.out.println("Added minuted: " + localTime.plusMinutes(2));
        localTime = localTime.plusHours(2);
        localTime = localTime.plusMinutes(2);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Formated time: " + localTime.format(dtf));

    }
}
