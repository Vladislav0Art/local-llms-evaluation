package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForYearBefore1800ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForYearBefore1800ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(-1799, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(13.72, result, 0.01);
    }

}