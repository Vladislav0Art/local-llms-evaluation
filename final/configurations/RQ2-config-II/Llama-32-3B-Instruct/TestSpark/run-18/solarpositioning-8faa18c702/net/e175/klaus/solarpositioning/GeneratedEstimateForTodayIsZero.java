package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedEstimateForTodayIsZero {

    @Test
    public void estimateForTodayIsZero() {
        LocalDate today = LocalDate.now();
        assertTrue(Math.abs(DeltaT.estimate(today)) < DoubleEPSILON);
    }

}