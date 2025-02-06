package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDecember_1969DeltaTReturnsCorrectValue {

    @Test
    public void estimateDecember_1969DeltaTReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1969, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.00001);
    }

}