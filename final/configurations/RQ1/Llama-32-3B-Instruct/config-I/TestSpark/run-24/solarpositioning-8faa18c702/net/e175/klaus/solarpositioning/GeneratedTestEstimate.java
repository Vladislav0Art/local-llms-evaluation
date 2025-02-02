package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimate {

    public static double estimate(LocalDate date) {
        int year = date.getYear();
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 366 : 365;
    }

    public static int decimalYear(LocalDate date) {
        return date.getYear() - 1901 + 1;
    }

    @Test
    public void testEstimate() {
        LocalDate date = new java.time.LocalDate(1950, 1, 1);
        assertEquals(63.86, estimate(date), 0.01);
    }

}