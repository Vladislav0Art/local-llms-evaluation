package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateTwoDatesWithDifferentYears {

    @Test
    public void testEstimateTwoDatesWithDifferentYears() {
        LocalDate forDate = LocalDate.of(2022, 8, 31);
        LocalDate nextYear = forDate.plusYears(1).withDayOfMonth(1);

        double expected = -3.0;
        assertEquals(expected, estimate(forDate), 0.001);
        assertEquals(expected, estimate(nextYear), 0.001);
    }

    public static class Estimate {
        private final int months;

        public Estimate(int months) {
            this.months = months;
        }

        public double estimate(LocalDate date) {
            return (date.getMonthValue() - 8) / months + 1;
        }
    }

}