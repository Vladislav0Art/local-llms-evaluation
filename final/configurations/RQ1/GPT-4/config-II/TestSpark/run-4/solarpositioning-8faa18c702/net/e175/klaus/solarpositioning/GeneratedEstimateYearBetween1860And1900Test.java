package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1860And1900Test {

    @Test
    public void estimateYearBetween1860And1900Test() {
        LocalDate date = LocalDate.of(1880, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(23.86, deltaT, 0.01);
    }

}