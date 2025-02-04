package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaTForYearBetween1700And1800Test {

    @Test
    public void estimate_DeltaTForYearBetween1700And1800Test() {
        LocalDate forDate = LocalDate.of(1750, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.79, result, 0.001);
    }

}