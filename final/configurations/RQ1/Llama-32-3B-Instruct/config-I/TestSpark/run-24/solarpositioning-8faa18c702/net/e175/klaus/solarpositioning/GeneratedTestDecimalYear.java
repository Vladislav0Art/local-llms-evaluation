package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecimalYear {

    public static double estimate(LocalDate date) {
        int year = date.getYear();
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
    }

    public static int decimalYear(LocalDate date) {
        return date.getYear() - 1901 + 1;
    }

    @Test
    public void testDecimalYear() {
        LocalDate date = new java.time.LocalDate(2200, 1, 1);
        assertEquals(99, decimalYear(date));
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

    public int getYear() {
        return year;
    }

}