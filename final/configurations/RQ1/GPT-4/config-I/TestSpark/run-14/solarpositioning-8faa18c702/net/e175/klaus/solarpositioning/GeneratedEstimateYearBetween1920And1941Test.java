package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1920And1941Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1920And1941Test() {
        LocalDate forDate = LocalDate.of(1941, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(29.860000000000003, result, DELTA);
    }

}