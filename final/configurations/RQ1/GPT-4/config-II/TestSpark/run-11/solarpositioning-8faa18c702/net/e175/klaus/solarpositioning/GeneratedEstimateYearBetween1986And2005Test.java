package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween1986And2005Test {

    @Test
    public void estimateYearBetween1986And2005Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1990, 7, 16));
        assertEquals(57.76, deltaT, 0.01);
    }

}