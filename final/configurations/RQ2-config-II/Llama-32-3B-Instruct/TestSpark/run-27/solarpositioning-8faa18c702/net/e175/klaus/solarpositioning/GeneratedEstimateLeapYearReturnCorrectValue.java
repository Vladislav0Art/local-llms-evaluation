package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateLeapYearReturnCorrectValue {

    @Test
    public void estimateLeapYearReturnCorrectValue() {
        LocalDate date = LocalDate.of(2024, 2, 29);
        double result = DeltaT.estimate(date);
        assertEquals(12.0466667, result, 0.001); // Adjust precision as needed
    }

}