package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimate_GivenAnyForDate_ReturnsZero {

    @Test
    public void estimate_GivenAnyForDate_ReturnsZero() {
        assertTrue(DeltaT.estimate(null) == 0);
    }

}