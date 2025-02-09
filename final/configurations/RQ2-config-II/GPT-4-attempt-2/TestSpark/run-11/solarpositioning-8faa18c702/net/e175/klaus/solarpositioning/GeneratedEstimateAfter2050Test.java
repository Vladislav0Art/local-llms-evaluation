package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateAfter2050Test {

    @Test
    public void estimateAfter2050Test() {
        LocalDate forDate = LocalDate.of(2051, 1, 1);
        double estimatedDeltaT = DeltaT.estimate(forDate);

        assertEquals(162.86, estimatedDeltaT, 0.01);
    }

}