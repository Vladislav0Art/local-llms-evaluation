package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void estimate_GivenAnyForDate_ReturnsZero() {
        assertTrue(DeltaT.estimate(forDate) == 0);
    }

    @Test
    public void estimate_GivenAnyForDate_ReturnsZero() {
        assertTrue(DeltaT.estimate(null) == 0);
    }

    @Test
    public void estimate_GivenNullForDate_ThrowsNullPointerException() {
        DeltaT.estimate(null);
    }

}