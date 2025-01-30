package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1600And1700Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1600And1700Test() {
        LocalDate date = LocalDate.of(1650, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(50.8032, deltaT, DELTA);
    }

}