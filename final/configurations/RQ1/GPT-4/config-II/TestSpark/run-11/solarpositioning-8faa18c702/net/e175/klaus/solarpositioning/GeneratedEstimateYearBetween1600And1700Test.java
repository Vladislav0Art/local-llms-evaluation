package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1600And1700Test {

    @Test
    public void estimateYearBetween1600And1700Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1650, 7, 23));
        assertEquals(77.84, deltaT, 0.01);
    }

}