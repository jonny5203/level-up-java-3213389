package com.linkedin.javacodechallenges;

import java.sql.Date;
import java.time.LocalDate;

public class App {
    // Create function to calculate the date that's
    // 100 days from now

    public static void main( String[] args )
    {
        LocalDate oneHundredDaysFromNow = calculateWhichDate(LocalDate.now(), 100);
        System.out.println("100 days from now is... " +
            oneHundredDaysFromNow);
    }

    private static LocalDate calculateWhichDate(LocalDate date, int daysInFuture) {
        return date.plusDays(daysInFuture);
    }
}
