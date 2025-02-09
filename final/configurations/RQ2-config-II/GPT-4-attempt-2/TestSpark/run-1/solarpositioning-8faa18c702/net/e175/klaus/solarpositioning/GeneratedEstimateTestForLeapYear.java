package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateTestForLeapYear {

    public static final double DELTA = 0.01;

    @Test
    public void estimateTestForLeapYear() {
        LocalDate date = LocalDate.of(2024, 1, 1);
        assertEquals(76.26, DeltaT.estimate(date), DELTA);
    }

}