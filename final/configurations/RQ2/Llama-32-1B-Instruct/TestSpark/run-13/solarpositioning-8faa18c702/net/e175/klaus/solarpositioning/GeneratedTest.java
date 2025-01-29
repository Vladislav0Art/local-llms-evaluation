package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testEstimate() {
        LocalDate forDate = LocalDate.of(2022, 9, 1);
        double expected = -0.001;
        assertEquals(expected, estimate(forDate), 0.001);
    }

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

    @Test
    public void testEstimateTwoDates() {
        LocalDate forDate = LocalDate.of(2022, 8, 31);
        LocalDate nextYear = forDate.plusYears(1).withDayOfMonth(1);

        double expected = -1.0;
        assertEquals(expected, estimate(forDate), 0.001);
        assertEquals(expected, estimate(nextYear), 0.001);
    }

    @Test
    public void testEstimateTwoDatesWithDifferentMonths() {
        LocalDate forDate = LocalDate.of(2022, 8, 31);
        LocalDate nextMonth = forDate.plusMonths(-3).withDayOfMonth(1);

        double expected = -1.0;
        assertEquals(expected, estimate(forDate), 0.001);
        assertEquals(expected, estimate(nextMonth), 0.001);
    }

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