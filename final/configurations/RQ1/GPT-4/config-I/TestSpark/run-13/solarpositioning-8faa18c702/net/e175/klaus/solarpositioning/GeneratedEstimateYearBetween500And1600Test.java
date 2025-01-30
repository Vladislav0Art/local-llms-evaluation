package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween500And1600Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween500And1600Test() {
        LocalDate date = LocalDate.of(1500, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(1114.908007, deltaT, DELTA);
    }

}