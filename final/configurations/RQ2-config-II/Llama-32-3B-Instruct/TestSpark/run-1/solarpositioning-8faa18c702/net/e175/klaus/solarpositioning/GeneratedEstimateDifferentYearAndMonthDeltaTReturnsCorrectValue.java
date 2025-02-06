package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDifferentYearAndMonthDeltaTReturnsCorrectValue {

    @Test
    public void estimateDifferentYearAndMonthDeltaTReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1971, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.00001);
    }

}