package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateZeroDeltaT_ZeroDateTest {

    @Test
    public void estimateZeroDeltaT_ZeroDateTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(0, result, 0.00001);
    }

}