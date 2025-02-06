package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedEstimateForTomorrowIsNegative {

    @Test
    public void estimateForTomorrowIsNegative() {
        LocalDate tomorrow = today.plusDays(1);
        assertFalse(Double.isNaN(DeltaT.estimate(tomorrow)));
        assertTrue(DeltaT.estimate(tomorrow) < 0);
    }

}