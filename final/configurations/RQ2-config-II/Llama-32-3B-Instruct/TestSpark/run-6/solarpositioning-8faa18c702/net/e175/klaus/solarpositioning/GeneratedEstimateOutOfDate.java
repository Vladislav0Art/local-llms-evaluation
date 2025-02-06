package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateOutOfDate {

    @Test
    public void estimateOutOfDate() {
        LocalDate forDate = LocalDate.now().minusDays(365);
        double result = DeltaT.estimate(forDate);
        assertEquals(-1, result);
    }

}