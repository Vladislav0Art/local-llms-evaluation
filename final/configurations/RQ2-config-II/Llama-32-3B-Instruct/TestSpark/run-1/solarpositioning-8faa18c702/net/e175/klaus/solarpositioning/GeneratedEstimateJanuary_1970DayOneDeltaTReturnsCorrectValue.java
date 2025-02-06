package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateJanuary_1970DayOneDeltaTReturnsCorrectValue {

    @Test
    public void estimateJanuary_1970DayOneDeltaTReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.00001);
    }

}