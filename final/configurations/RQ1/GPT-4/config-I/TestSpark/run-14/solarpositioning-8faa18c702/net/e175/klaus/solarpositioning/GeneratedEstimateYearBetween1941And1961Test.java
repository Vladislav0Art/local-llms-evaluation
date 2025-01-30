package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1941And1961Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1941And1961Test() {
        LocalDate forDate = LocalDate.of(1961, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(33.590040816326524, result, DELTA);
    }

}