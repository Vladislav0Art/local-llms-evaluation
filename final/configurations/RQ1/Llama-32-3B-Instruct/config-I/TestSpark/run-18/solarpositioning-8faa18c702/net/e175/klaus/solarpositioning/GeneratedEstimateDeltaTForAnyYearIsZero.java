package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForAnyYearIsZero {

    @Test
    public void estimateDeltaTForAnyYearIsZero() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0.0, result);
    }

}