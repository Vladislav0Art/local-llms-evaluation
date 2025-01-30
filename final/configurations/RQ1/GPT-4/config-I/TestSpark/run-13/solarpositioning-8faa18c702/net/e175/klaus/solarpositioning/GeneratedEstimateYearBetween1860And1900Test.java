package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1860And1900Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1860And1900Test() {
        LocalDate date = LocalDate.of(1900, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-3.064187854, deltaT, DELTA);
    }

}