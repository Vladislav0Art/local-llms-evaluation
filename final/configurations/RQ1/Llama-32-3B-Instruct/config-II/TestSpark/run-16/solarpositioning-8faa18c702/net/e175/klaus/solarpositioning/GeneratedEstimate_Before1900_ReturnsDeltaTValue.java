package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_Before1900_ReturnsDeltaTValue {

    @Test
    public void estimate_Before1900_ReturnsDeltaTValue() {
        LocalDate forDate = LocalDate.of(1875, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result > -20 && result < 120);
    }

}