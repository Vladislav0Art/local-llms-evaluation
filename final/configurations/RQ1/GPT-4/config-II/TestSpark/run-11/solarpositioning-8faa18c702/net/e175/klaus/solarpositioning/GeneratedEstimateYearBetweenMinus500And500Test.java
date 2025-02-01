package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearBetweenMinus500And500Test {

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        final double deltaT = DeltaT.estimate(LocalDate.of(0, 12, 31));
        assertEquals(2219.43, deltaT, 0.01);
    }

}