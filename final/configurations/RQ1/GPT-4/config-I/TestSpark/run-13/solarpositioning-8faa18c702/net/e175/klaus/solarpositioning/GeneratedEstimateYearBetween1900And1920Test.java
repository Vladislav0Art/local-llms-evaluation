package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class GeneratedEstimateYearBetween1900And1920Test {

    private static final double DELTA = 1e-2;

    @Test
    public void estimateYearBetween1900And1920Test() {
        LocalDate date = LocalDate.of(1920, Month.JANUARY, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(21.163125, deltaT, DELTA);
    }

}