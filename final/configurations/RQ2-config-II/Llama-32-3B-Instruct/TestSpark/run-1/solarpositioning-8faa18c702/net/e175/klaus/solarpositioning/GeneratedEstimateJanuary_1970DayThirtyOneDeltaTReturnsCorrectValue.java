package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateJanuary_1970DayThirtyOneDeltaTReturnsCorrectValue {

    @Test
    public void estimateJanuary_1970DayThirtyOneDeltaTReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1970, 1, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.00001);
    }

}