package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween500And1600Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween500And1600Test() {
        LocalDate forDate = LocalDate.of(1600, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-13972.020648349655, result, DELTA);
    }

}