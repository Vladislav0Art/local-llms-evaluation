package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTCloseTo2005Test {

    @Test
    public void estimate_DeltaTCloseTo2005Test() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(63.86, estimatedDeltaT, 0.01);
    }

}