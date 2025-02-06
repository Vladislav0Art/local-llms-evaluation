package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedCalculateSolarPosition_WithAllParameters_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithAllParameters_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 1013.25, 20.1);

        // Assert
        assertNotNull(result);
    }

}