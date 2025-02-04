package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaT_forCurrentYear_ReturnsCorrectValue {

    @Test
    public void estimate_DeltaT_forCurrentYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(2022, 1, 1);

        // When:
        double result = DeltaT.estimate(forDate);

        // Then:
        assertEquals(0.0087, result, 0.00001);
    }

}