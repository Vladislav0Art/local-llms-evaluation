package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_EmptyMonthValue_ReturnsCorrectDeltaTValue {

    @Test
    public void estimate_EmptyMonthValue_ReturnsCorrectDeltaTValue() {
        LocalDate forDate = LocalDate.of(2000, 1, 15);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -20 && result <= 120);
    }

}