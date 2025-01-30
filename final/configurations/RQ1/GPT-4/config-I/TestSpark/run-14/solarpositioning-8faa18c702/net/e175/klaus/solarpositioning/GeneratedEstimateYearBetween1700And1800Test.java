package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1700And1800Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1700And1800Test() {
        LocalDate forDate = LocalDate.of(1800, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(13.455021543985636, result, DELTA);
    }

}