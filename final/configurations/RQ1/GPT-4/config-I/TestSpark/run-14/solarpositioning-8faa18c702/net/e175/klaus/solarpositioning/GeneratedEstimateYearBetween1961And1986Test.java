package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1961And1986Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1961And1986Test() {
        LocalDate forDate = LocalDate.of(1986, 1, 1);
        double result = DeltaT.estimate(forDate);
        double expected = 55.50574999999999;
        assertEquals(expected, result, DELTA);
    }

}