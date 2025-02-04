package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBetween1820And500Test {

    @Test
    public void estimate_DeltaTForYearBetween1820And500Test() {
        LocalDate forDate = LocalDate.of(1825, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(32.0, result, 0.001);
    }

}