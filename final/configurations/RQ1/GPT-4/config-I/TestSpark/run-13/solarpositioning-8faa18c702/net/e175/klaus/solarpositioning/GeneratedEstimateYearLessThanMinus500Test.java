package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearLessThanMinus500Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearLessThanMinus500Test() {
        LocalDate date = LocalDate.of(-1000, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-3535.2, deltaT, DELTA);
    }

}