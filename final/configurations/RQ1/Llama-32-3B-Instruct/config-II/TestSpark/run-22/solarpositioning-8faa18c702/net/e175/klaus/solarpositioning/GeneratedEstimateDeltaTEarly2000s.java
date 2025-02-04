package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTEarly2000s {

    @Test
    public void estimateDeltaTEarly2000s() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(63.86, result, 0.01);
    }

}