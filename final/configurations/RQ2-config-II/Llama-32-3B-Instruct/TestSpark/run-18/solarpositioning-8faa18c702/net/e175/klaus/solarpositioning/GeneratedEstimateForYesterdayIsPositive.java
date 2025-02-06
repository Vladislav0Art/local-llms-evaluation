package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedEstimateForYesterdayIsPositive {

    @Test
    public void estimateForYesterdayIsPositive() {
        LocalDate yesterday = today.minusDays(1);
        assertFalse(Double.isNaN(DeltaT.estimate(yesterday)));
        assertTrue(DeltaT.estimate(yesterday) > 0);
    }

}