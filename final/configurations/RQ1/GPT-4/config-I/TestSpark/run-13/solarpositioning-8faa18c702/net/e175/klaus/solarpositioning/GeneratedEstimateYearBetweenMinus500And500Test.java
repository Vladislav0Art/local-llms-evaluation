package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetweenMinus500And500Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetweenMinus500And500Test() {
        LocalDate date = LocalDate.of(400, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(7096.706144, deltaT, DELTA);
    }

}