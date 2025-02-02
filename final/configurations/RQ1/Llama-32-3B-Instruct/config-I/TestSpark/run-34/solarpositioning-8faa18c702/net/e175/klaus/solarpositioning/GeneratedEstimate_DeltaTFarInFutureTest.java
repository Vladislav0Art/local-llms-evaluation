package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTFarInFutureTest {

    @Test
    public void estimate_DeltaTFarInFutureTest() {
        LocalDate forDate = LocalDate.of(2150, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);
        assertEquals(-20, estimatedDeltaT, 0.01);
    }

}