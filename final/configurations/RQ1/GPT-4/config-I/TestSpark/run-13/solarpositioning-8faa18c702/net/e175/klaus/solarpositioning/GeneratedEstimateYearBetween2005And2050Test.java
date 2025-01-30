package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween2005And2050Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween2005And2050Test() {
        LocalDate date = LocalDate.of(2030, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(66.68217, deltaT, DELTA);
    }

}