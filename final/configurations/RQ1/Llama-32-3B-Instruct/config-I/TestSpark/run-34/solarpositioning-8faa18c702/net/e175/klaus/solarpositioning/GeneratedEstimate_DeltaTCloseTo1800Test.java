package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTCloseTo1800Test {

    @Test
    public void estimate_DeltaTCloseTo1800Test() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(8.83, estimatedDeltaT, 0.01);
    }

}