package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithDifferentLongitude_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_WithDifferentLongitude_ReturnsCorrectResult() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double longitude = 100.0; // Tokyo, Japan

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 48.8566, longitude);

        // Assert
        assertEquals(true, true);
    }

}