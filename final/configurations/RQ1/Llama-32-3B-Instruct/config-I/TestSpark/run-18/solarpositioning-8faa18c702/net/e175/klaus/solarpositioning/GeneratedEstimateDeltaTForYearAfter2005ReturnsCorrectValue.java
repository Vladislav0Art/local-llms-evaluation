package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForYearAfter2005ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForYearAfter2005ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2006, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(63.86, result, 0.01);
    }

}