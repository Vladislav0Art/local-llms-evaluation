package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1986And2005Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1986And2005Test() {
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(63.71767, deltaT, DELTA);
    }

}