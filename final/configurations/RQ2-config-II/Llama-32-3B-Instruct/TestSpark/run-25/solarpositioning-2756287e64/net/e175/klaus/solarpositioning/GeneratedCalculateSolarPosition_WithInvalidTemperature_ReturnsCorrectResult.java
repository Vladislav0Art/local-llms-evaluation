package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_WithInvalidTemperature_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition_WithInvalidTemperature_ReturnsCorrectResult() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 1013.25;
        double temperature = Double.NEGATIVE_INFINITY;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        assertNotNull(result);
    }

}