package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_ForDateYearAfter500_ReturnsCorrectValue {

    @Test
    public void estimateDeltaT_ForDateYearAfter500_ReturnsCorrectValue() {
        // Given
        LocalDate forDate = LocalDate.of(1500, 1, 1);

        // When
        double result = DeltaT.estimate(forDate);

        // Then
        assertEquals(result, -20 + 32 * pow((forDate.getYear() / 100) - 1820, 2), 0);
    }

}