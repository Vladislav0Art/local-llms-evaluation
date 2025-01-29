package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testCalculateSolarPosition_NoParameters() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.1;
        double longitude = 0.2;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        // Assert
        assertNotSame(result, null);
    }

    @Test
    public void testCalculateSolarPosition_Angle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.1;
        double longitude = 0.2;

        when(Grena3.calculateSolarPosition(date, latitude, longitude)).thenReturn(AzimuthZenithAngle.LOW);

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 123, 456, 789);

        // Assert
        assertNotSame(result, null);
    }

    @Test
    public void testCalculateSolarPosition_Pressure() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.1;
        double longitude = 0.2;

        when(Grena3.calculateSolarPosition(date, latitude, longitude)).thenReturn(AzimuthZenithAngle.LOW);

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10000, 200000, 30000);

        // Assert
        assertNotSame(result, null);
    }

    @Test
    public void testCalculateSolarPosition_Temperature() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.1;
        double longitude = 0.2;

        when(Grena3.calculateSolarPosition(date, latitude, longitude)).thenReturn(AzimuthZenithAngle.LOW);

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 100, 200);

        // Assert
        assertNotSame(result, null);
    }

    @Test
    public void testCalculateSolarPosition_DeltaT() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.1;
        double longitude = 0.2;

        when(Grena3.calculateSolarPosition(date, latitude, longitude)).thenReturn(AzimuthZenithAngle.LOW);

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10, -20, -30);

        // Assert
        assertNotSame(result, null);
    }

}