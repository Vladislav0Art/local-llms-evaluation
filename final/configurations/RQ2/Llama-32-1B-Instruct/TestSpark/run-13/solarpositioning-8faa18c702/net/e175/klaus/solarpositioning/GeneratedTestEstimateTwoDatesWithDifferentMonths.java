package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateTwoDatesWithDifferentMonths {

    @Test
    public void testEstimateTwoDatesWithDifferentMonths() {
        LocalDate forDate = LocalDate.of(2022, 8, 31);
        LocalDate nextMonth = forDate.plusMonths(-3).withDayOfMonth(1);

        double expected = -1.0;
        assertEquals(expected, estimate(forDate), 0.001);
        assertEquals(expected, estimate(nextMonth), 0.001);
    }

}