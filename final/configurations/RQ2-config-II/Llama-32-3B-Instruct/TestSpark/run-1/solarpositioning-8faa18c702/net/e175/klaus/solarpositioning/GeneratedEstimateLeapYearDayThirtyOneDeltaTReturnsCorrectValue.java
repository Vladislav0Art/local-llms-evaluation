package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearDayThirtyOneDeltaTReturnsCorrectValue {

    @Test
    public void estimateLeapYearDayThirtyOneDeltaTReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1976, 2, 29);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.00001);
    }

}