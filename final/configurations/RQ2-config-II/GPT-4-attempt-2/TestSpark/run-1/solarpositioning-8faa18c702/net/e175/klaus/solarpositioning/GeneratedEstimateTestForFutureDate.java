package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForFutureDate {

    public static final double DELTA = 0.01;

    @Test
    public void estimateTestForFutureDate() {
        LocalDate date = LocalDate.of(2050, 1, 1);
        assertEquals(96.03, DeltaT.estimate(date), DELTA);
    }

}