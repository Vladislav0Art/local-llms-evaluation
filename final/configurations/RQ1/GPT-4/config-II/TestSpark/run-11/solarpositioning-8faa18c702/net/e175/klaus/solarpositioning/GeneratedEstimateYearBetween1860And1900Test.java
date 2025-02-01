package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1860And1900Test {

    @Test
    public void estimateYearBetween1860And1900Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1880, 9, 10));
        assertEquals(1.88, deltaT, 0.01);
    }

}