package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateTwoDates {

    @Test
    public void testEstimateTwoDates() {
        LocalDate forDate = LocalDate.of(2022, 8, 31);
        LocalDate nextYear = forDate.plusYears(1).withDayOfMonth(1);

        double expected = -1.0;
        assertEquals(expected, estimate(forDate), 0.001);
        assertEquals(expected, estimate(nextYear), 0.001);
    }

}