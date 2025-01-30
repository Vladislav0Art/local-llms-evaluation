package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1900And1920Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1900And1920Test() {
        LocalDate forDate = LocalDate.of(1920, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(21.5488, result, DELTA);
    }

}