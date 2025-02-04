package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedDecimalYear_InPastYear_ReturnsCorrectValue {

    @Test
    public void decimalYear_InPastYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(-2022, 1, 1);

        // When:
        double result = DeltaT.decimalYear(forDate);

        // Then:
        assertEquals(0.5, result, 0);
    }

}