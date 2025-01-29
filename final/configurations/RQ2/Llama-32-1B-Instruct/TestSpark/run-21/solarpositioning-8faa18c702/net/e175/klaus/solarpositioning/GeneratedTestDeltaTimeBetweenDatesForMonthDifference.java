package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GeneratedTestDeltaTimeBetweenDatesForMonthDifference {

    @Test
    public void testDeltaTimeBetweenDatesForMonthDifference() {
        LocalDate forDate1 = LocalDate.of(2024, 3, 31);
        LocalDate forDate2 = LocalDate.of(2025, 3, 1);
        double expected = pow((forDate2.getYear() - forDate1.getYear()), 2) * (24 * 3600); // assuming time between dates is multiple years squared
        assertEquals(expected, DeltaT.estimate(forDate1), 0.001);
    }

}