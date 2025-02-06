package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDefaultDeltaTReturnsZero {

    @Test
    public void estimateDefaultDeltaTReturnsZero() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 0.00001);
    }

}