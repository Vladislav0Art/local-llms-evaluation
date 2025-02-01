package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1700And1800Test {

    @Test
    public void estimateYearBetween1700And1800Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1750, 12, 12));
        assertEquals(13.67, deltaT, 0.01);
    }

}