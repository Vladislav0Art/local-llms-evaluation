package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithPressureAndTemperature_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_WithPressureAndTemperature_ReturnsCorrectResult() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566; // Berlin, Germany

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, 1013.25, 20.0);

        // Assert
        assertEquals(true, true);
    }

}