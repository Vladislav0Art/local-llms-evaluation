package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedTest {

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

    @Test
    public void calculateSolarPosition_NoLatitude_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double longitude = -74.0060;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 0, longitude, deltaT);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_NoLongitude_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double latitude = 40.7128;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, 0, deltaT);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_NoDeltaT_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double latitude = 40.7128;
        double longitude = -74.0060;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_WithDate_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_WithPressure_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 1013.25);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void calculateSolarPosition_WithTemperature_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZoneOffset.ofHours(0).atInstant(UUID.randomUUID().toString());
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 12.5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, null, 20.1);

        // Assert
        assertNotNull(result);
    }

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