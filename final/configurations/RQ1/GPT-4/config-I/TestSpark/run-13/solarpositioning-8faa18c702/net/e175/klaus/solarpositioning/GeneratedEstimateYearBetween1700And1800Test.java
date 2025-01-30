package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1700And1800Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1700And1800Test() {
        LocalDate date = LocalDate.of(1750, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(13.097572, deltaT, DELTA);
    }

}