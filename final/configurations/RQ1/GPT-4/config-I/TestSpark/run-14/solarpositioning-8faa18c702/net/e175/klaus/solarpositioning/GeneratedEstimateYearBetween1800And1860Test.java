package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1800And1860Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1800And1860Test() {
        LocalDate forDate = LocalDate.of(1860, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(8.238097747252748, result, DELTA);
    }

}