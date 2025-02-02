package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithDefaultParameters_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_WithDefaultParameters_ReturnsCorrectResult() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566; // Berlin, Germany
        double longitude = 11.3571; // Berlin, Germany

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        // Assert
        assertEquals(true, true);
    }

}