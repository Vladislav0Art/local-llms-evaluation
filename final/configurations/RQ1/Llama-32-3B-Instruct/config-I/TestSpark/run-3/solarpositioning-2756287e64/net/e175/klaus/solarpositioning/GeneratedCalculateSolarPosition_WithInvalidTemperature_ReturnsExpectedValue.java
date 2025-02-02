package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCalculateSolarPosition_WithInvalidTemperature_ReturnsExpectedValue {

    @Test
    public void calculateSolarPosition_WithInvalidTemperature_ReturnsExpectedValue() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8567;
        double longitude = 2.3508;
        double deltaT = 0.00000;
        double temperature = -270;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, temperature);

        // Assert
        assertTrue(result.getAzimuth() > 0);
        assertTrue(result.getZenith() > 0);
    }

}