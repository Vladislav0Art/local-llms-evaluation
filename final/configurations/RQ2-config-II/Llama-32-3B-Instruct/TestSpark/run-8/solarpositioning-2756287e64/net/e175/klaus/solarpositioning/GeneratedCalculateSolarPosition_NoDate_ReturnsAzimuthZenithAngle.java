package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedCalculateSolarPosition_NoDate_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_NoDate_ReturnsAzimuthZenithAngle() {
        // Arrange
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(null, latitude, longitude, deltaT);

        // Assert
        assertNotNull(result);
    }

}