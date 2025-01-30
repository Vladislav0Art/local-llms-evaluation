package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetweenMinus500And500Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        LocalDate forDate = LocalDate.of(500, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(10959.40561106118, result, DELTA);
    }

}