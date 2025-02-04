package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTEarly1900s {

    @Test
    public void estimateDeltaTEarly1900s() {
        LocalDate forDate = LocalDate.of(1899, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(7.62, result, 0.01);
    }

}