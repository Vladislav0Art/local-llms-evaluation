package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBetween1000And1600Test {

    @Test
    public void estimate_DeltaTForYearBetween1000And1600Test() {
        LocalDate forDate = LocalDate.of(1550, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(71.23472, result, 0.001);
    }

}