package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween2050And2150Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween2050And2150Test() {
        LocalDate date = LocalDate.of(2100, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(53.790866, deltaT, DELTA);
    }

}