package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedEstimateForAnyDateIsNonZero {

    @Test
    public void estimateForAnyDateIsNonZero() {
        LocalDate anyDate = LocalDate.of(2022, 7, 25);
        assertFalse(Double.isNaN(DeltaT.estimate(anyDate)));
        assertTrue(Math.abs(DeltaT.estimate(anyDate)) < DoubleEPSILON);
    }

}