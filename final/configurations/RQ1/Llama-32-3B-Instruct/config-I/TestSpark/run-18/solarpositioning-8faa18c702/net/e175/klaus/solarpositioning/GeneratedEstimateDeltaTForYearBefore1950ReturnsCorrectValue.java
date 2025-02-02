package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForYearBefore1950ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForYearBefore1950ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(-1949, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(29.07, result, 0.01);
    }

}