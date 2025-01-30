package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween2005And2050Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween2005And2050Test() {
        LocalDate forDate = LocalDate.of(2050, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(79.227775, result, DELTA);
    }

}