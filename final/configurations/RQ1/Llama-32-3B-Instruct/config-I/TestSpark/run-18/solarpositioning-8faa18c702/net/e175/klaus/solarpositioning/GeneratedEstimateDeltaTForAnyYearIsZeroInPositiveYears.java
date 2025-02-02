package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForAnyYearIsZeroInPositiveYears {

    @Test
    public void estimateDeltaTForAnyYearIsZeroInPositiveYears() {
        LocalDate forDate = LocalDate.of(1900, 1, 15);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(0.0, result);
    }

}