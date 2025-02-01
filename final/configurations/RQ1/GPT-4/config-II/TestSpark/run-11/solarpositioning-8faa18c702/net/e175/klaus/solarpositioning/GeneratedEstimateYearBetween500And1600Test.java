package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetween500And1600Test {

    @Test
    public void estimateYearBetween500And1600Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(1500, 1, 1));
        assertEquals(4251.01, deltaT, 0.01);
    }

}