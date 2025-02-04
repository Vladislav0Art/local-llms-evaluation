package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_EmptyYearRange_ReturnsNaN {

    @Test
    public void estimate_EmptyYearRange_ReturnsNaN() {
        assertEquals(Double.NaN, DeltaT.estimate(LocalDate.of(1800, 1, 1)));
    }

}