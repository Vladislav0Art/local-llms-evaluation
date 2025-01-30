package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1920And1941Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1920And1941Test() {
        LocalDate date = LocalDate.of(1941, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(29.176205, deltaT, DELTA);
    }

}