package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForCurrentDate {

    public static final double DELTA = 0.01;

    @Test
    public void estimateTestForCurrentDate() {
        // please replace it with the current date before running the test
        LocalDate date = LocalDate.of(2022, 1, 1);
        assertEquals(73.72, DeltaT.estimate(date), DELTA);
    }

}