package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateForSameDate_ReturnsSameValue {

    @Test
    public void estimateForSameDate_ReturnsSameValue() {
        LocalDate date = LocalDate.now();
        assertEquals(0.000000, DeltaT.estimate(date), 1e-8);
        assertEquals(0.000000, DeltaT.estimate(date), 1e-8);
    }

}