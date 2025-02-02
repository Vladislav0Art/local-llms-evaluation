package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTForYearAfter2150ReturnsCorrectValue {

    @Test
    public void estimateDeltaTForYearAfter2150ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2169, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(forDate);
        assertEquals(-20, result);
    }

}