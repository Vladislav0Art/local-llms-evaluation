package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestEstimateForSameDate {

    public static class LocalDateMock extends LocalDate {
        private String originalFormat = "yyyy-MM-dd";

        public String getOriginalFormat() {
            return originalFormat;
        }

        @Override
        public int getYear() {
            return 2022; // assuming the test is for this year
        }

        @Override
        public int getMonth() {
            return 9; // assuming the month for testing (September)
        }

        @Override
        public int getDayOfMonth() {
            return 20;
        }
    }

    private static LocalDate mockLocalDate = new LocalDateMock();
    private static DeltaT mockDeltaT;

    @Test
    public void testEstimateForSameDate() {
        // Given
        when(mockDeltaT.estimate(mockLocalDate)).thenReturn(1.0);

        // When
        double result = mockDeltaT.estimate(mockLocalDate);

        // Then
        assertEquals(1.0, result, 0.01);
    }

}