package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForDateInThePast {

    public static final double DELTA = 0.01;

    @Test
    public void estimateTestForDateInThePast() {
        LocalDate date = LocalDate.of(1920, 1, 1);
        assertEquals(21.20, DeltaT.estimate(date), DELTA);
    }

}