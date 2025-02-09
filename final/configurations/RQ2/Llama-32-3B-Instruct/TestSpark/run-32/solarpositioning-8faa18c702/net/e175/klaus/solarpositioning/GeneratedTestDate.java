package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GeneratedTestDate {

    public Optional<Double> estimate(LocalDate date) {
        return Optional.empty();
    }
}

public class LocalDate {
    private int year;
    private int month;
    private int day;

    public LocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static LocalDate of(int year, int month, int day) {
        return new LocalDate(year, month, day);
    }
}

public class GeneratedTest {

    @Test
    public void testDate() {
        LocalDate date = LocalDate.of(2022, 6, 21);
        System.out.println("Date is " + date);
    }

}