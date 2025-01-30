package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1600And1700Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1600And1700Test() {
        LocalDate forDate = LocalDate.of(1700, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(10.763775510204082, result, DELTA);
    }

}