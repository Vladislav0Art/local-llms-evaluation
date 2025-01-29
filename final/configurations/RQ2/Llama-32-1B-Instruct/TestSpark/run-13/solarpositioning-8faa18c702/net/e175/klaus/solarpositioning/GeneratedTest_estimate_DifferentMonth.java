package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_estimate_DifferentMonth {

    public double estimate(LocalDate forDate) {
        LocalDate currentDate = forDate.plusDays(1);
        return pow(currentDate, 365.25) - pow(forDate, 365.25);
    }

    @Test
    public void test_estimate_DifferentMonth() {
        LocalDate forDate = LocalDate.of(2022, 9, 1);
        LocalDate newDate = forDate.plusMonths(-3).withDayOfMonth(1);
        double expected = estimate(newDate) - estimate(forDate);
        double actual = DeltaT.estimate(newDate);
        assertEquals(expected, actual, 0.001);
    }

}