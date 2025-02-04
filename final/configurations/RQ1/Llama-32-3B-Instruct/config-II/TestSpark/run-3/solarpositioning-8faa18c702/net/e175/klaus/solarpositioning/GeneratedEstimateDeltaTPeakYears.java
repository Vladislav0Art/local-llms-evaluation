package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTPeakYears {

    @Test
    public void estimateDeltaTPeakYears() {
        LocalDate forDate = LocalDate.of(1950, 1, 1);
        assertEquals(63.86, DeltaT.estimate(forDate), 0.001);
    }

}