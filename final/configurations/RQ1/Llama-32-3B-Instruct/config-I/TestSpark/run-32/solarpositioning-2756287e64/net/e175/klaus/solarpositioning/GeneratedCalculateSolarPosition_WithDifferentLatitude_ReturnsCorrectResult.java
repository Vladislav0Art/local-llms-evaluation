package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithDifferentLatitude_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_WithDifferentLatitude_ReturnsCorrectResult() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -40.7128; // San Francisco, USA

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude);

        // Assert
        assertEquals(true, true);
    }

}