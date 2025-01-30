package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearGreaterThan2150Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate date = LocalDate.of(3000, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(392421.92, deltaT, DELTA);
    }

}