package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1986And2005Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1986And2005Test() {
        LocalDate forDate = LocalDate.of(2005, 1, 1);
        double result = DeltaT.estimate(forDate);
        double expected = 64.35860871916377;
        assertEquals(expected, result, DELTA);
    }

}