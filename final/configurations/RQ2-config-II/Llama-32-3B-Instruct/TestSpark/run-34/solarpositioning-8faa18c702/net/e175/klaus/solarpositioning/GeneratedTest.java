package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimate_DefinedDate_ReturnsProperValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double result = DeltaT.estimate(forDate);
        // Use a delta of 0.01 for comparison to account for floating point precision issues.
        assertEquals(Math.round(result * 100) / 100d, 12.9567, 0.01);
    }

    @Test
    public void estimate_InvalidDate_ReturnsProperValue() {
        LocalDate forDate = null;
        double result = DeltaT.estimate(forDate);
        assertEquals(0d, result);
    }

    @Test
    public void estimate_IncorrectDate_ReturnsProperValue() {
        LocalDate forDate = LocalDate.of(2022, 13, 15);
        double result = DeltaT.estimate(forDate);
        // Use a delta of 0.01 for comparison to account for floating point precision issues.
        assertEquals(Math.round(result * 100) / 100d, -6.9593, 0.01);
    }

}