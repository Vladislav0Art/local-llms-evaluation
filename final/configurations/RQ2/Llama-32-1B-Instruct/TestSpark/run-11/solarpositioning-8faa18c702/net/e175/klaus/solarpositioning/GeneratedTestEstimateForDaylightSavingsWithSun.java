package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedTestEstimateForDaylightSavingsWithSun {

    @Test
    public void testEstimateForDaylightSavingsWithSun() {
        // Arrange
        LocalDate forDate = LocalDate.now();

        // Act
        double result = new DeltaT().estimate(forDate);

        // Assert
        assertEquals(0.0001, result, 10e-12);
    }

}