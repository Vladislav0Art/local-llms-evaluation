package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DifferentYearsReturnsSameDeltaT {

    @Test
    public void estimate_DifferentYearsReturnsSameDeltaT() {
        LocalDate forDate1 = LocalDate.of(1800, 1, 1);
        LocalDate forDate2 = LocalDate.of(1810, 1, 1);
        double estimatedDeltaT1 = DeltaT.estimate(forDate1);
        double estimatedDeltaT2 = DeltaT.estimate(forDate2);
        assertEquals(estimatedDeltaT1, estimatedDeltaT2, 0.00001);
    }

}