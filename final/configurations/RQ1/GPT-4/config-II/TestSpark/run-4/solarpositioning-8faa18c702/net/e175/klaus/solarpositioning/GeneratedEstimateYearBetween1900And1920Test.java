package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1900And1920Test {

    @Test
    public void estimateYearBetween1900And1920Test() {
        LocalDate date = LocalDate.of(1910, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(10.46, deltaT, 0.01);
    }

}