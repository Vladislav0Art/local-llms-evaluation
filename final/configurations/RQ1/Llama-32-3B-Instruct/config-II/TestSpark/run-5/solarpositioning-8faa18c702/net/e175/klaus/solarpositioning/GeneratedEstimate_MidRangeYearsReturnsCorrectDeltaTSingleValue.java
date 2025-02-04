package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_MidRangeYearsReturnsCorrectDeltaTSingleValue {

    @Test
    public void estimate_MidRangeYearsReturnsCorrectDeltaTSingleValue() {
        LocalDate forDate = LocalDate.of(1850, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20.0, estimatedDeltaT, 0.00001);
    }

}