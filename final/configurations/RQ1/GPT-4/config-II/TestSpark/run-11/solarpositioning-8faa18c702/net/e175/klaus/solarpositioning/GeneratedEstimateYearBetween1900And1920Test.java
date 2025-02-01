package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1900And1920Test {

    @Test
    public void estimateYearBetween1900And1920Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1910, 4, 15));
        assertEquals(13.37, deltaT, 0.01);
    }

}