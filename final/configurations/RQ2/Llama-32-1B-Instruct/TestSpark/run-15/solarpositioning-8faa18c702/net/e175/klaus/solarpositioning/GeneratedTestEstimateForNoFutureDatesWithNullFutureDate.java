package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;

public class GeneratedTestEstimateForNoFutureDatesWithNullFutureDate {

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
    public void testEstimateForNoFutureDatesWithNullFutureDate() {
        // Given
        when(mockDeltaT.estimate(new LocalDate(2022 + 10, 20, 1))).thenAnswer(answer -> answer.getArguments()[0].getYear() == 2032 ? 5 : 4).given().throwException(new Exception("No future date"));

        // When
        try {
            mockDeltaT.estimate(mockLocalDate);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "No future date", 10);
        }
    }

}