package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimate_DeltaT_forFutureYear_ReturnsCorrectValue {

    @Test
    public void estimate_DeltaT_forFutureYear_ReturnsCorrectValue() {
        // Given:
        LocalDate forDate = LocalDate.of(2023, 1, 1);

        // When:
        double result = DeltaT.estimate(forDate);

        // Then:
        assertEquals(0.0107, result, 0.00001);
    }

}