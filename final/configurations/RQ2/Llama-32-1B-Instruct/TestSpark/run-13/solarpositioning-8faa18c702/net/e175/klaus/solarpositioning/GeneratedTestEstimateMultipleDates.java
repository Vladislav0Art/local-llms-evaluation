package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateMultipleDates {

    @Test
    public void testEstimateMultipleDates() {
        LocalDate forDate = LocalDate.of(2022, 8, 31);
        LocalDate nextMonth = forDate.plusMonths(1).withDayOfMonth(1);
        LocalDate laterYear = nextMonth.plusYears(5).withDayOfMonth(1);

        double expected = -0.001;
        assertEquals(expected, estimate(forDate), 0.001);
        assertEquals(expected, estimate(nextMonth), 0.001);
        assertEquals(expected, estimate(laterYear), 0.001);
    }

}