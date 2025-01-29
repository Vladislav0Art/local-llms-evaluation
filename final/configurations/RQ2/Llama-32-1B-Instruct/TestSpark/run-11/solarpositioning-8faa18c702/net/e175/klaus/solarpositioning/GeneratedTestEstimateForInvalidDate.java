package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedTestEstimateForInvalidDate {

    @Test
    public void testEstimateForInvalidDate() {
        // Arrange
        LocalDate forDate = null;
        String expectedValue = "0.0001";

        // Act
        double result = new DeltaT().estimate(forDate);

        // Assert
        assertEquals(expectedValue, result);
    }

}