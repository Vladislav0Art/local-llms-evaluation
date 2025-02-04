package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTLowYearLess500 {

    @Test
    public void estimateDeltaTLowYearLess500() {
        LocalDate forDate = LocalDate.of(-1500, 1, 1);
        assertEquals(-20.0, DeltaT.estimate(forDate), 0.001);
    }

}