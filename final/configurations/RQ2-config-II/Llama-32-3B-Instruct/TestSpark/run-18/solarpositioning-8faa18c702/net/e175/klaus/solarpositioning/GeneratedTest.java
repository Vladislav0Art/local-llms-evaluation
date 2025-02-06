package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateForDateIsNotNull() {
        assertFalse(DeltaT.estimate(null));
    }

    @Test
    public void estimateForTodayIsZero() {
        LocalDate today = LocalDate.now();
        assertTrue(Math.abs(DeltaT.estimate(today)) < DoubleEPSILON);
    }

    @Test
    public void estimateForTomorrowIsNegative() {
        LocalDate tomorrow = today.plusDays(1);
        assertFalse(Double.isNaN(DeltaT.estimate(tomorrow)));
        assertTrue(DeltaT.estimate(tomorrow) < 0);
    }

    @Test
    public void estimateForYesterdayIsPositive() {
        LocalDate yesterday = today.minusDays(1);
        assertFalse(Double.isNaN(DeltaT.estimate(yesterday)));
        assertTrue(DeltaT.estimate(yesterday) > 0);
    }

    @Test
    public void estimateForAnyDateIsNonZero() {
        LocalDate anyDate = LocalDate.of(2022, 7, 25);
        assertFalse(Double.isNaN(DeltaT.estimate(anyDate)));
        assertTrue(Math.abs(DeltaT.estimate(anyDate)) < DoubleEPSILON);
    }

    @Test
    public void estimateForAnyDateIsNotNegative() {
        LocalDate anyDate = LocalDate.of(2022, 7, 25);
        assertFalse(Double.isNaN(DeltaT.estimate(anyDate)));
        assertTrue(DeltaT.estimate(anyDate) >= 0);
    }
}

}