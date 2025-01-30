package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearBetween1860And1900Test {

    private static final double DELTA = 1e-15;

    @Test
    public void estimateYearBetween1860And1900Test() {
        LocalDate forDate = LocalDate.of(1900, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-1.4544137931034482, result, DELTA);
    }

}