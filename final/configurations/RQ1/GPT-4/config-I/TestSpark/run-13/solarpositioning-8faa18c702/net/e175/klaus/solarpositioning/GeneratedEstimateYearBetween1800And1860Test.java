package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1800And1860Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1800And1860Test() {
        LocalDate date = LocalDate.of(1850, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(7.212129608, deltaT, DELTA);
    }

}