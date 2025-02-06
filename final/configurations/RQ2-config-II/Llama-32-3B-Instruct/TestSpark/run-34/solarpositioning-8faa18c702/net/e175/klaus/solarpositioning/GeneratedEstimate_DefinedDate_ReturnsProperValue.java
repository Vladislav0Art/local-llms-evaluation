package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DefinedDate_ReturnsProperValue {

    @Test
    public void estimate_DefinedDate_ReturnsProperValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double result = DeltaT.estimate(forDate);
        // Use a delta of 0.01 for comparison to account for floating point precision issues.
        assertEquals(Math.round(result * 100) / 100d, 12.9567, 0.01);
    }

}