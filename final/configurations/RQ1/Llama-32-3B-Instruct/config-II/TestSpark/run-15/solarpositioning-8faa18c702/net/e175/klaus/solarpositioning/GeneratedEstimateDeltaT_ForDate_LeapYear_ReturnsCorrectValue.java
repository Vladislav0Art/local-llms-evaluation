package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateDeltaT_ForDate_LeapYear_ReturnsCorrectValue {

    @Test
    public void estimateDeltaT_ForDate_LeapYear_ReturnsCorrectValue() {
        // Given
        LocalDate forDate = LocalDate.of(1601, 3, 1);

        // When
        double result = DeltaT.estimate(forDate);

        // Then
        assertEquals(result, -20 + 32 * pow((forDate.getYear() / 100) - 1820, 2), 0);
    }

}

public class UnitTestUtils {

    public static void assertDeltaT(double expected, double actual) {
        org.junit.Assert.assertEquals(expected, actual, 0.001);
    }

}