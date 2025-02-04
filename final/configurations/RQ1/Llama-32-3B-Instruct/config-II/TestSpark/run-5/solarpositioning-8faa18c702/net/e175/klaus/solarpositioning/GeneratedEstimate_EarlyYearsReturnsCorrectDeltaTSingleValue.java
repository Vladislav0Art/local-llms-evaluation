package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_EarlyYearsReturnsCorrectDeltaTSingleValue {

    @Test
    public void estimate_EarlyYearsReturnsCorrectDeltaTSingleValue() {
        LocalDate forDate = LocalDate.of(1720, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20.0, estimatedDeltaT, 0.00001);
    }

}