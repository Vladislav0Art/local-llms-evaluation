package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_ForDateYearBefore500_ReturnsCorrectValue {

    @Test
    public void estimateDeltaT_ForDateYearBefore500_ReturnsCorrectValue() {
        // Given
        LocalDate forDate = LocalDate.of(400, 1, 1);

        // When
        double result = DeltaT.estimate(forDate);

        // Then
        assertEquals(10583.6 - 1014.41 * (forDate.getYear() / 100) + 33.78311 * pow((forDate.getYear() / 100), 2) - 5.952053 * pow((forDate.getYear() / 100), 3) - 0.1798452 * pow((forDate.getYear() / 100), 4) + 0.022174192 * pow((forDate.getYear() / 100), 5) + 0.0090316521 * pow((forDate.getYear() / 100), 6), result);
    }

}