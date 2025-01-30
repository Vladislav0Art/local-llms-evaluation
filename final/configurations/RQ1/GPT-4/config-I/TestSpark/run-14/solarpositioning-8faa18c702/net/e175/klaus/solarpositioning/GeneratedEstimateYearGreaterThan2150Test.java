package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearGreaterThan2150Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate forDate = LocalDate.of(2150, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-9.066212121212123, result, DELTA);
    }

}