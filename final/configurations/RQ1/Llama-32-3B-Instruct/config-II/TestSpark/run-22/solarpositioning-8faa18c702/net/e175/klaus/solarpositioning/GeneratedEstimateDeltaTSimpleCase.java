package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaTSimpleCase {

    @Test
    public void estimateDeltaTSimpleCase() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(13.72, result, 0.01);
    }

}