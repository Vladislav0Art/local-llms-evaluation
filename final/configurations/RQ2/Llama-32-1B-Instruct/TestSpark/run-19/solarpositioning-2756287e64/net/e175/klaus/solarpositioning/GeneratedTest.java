package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                      final double longitude, final double deltaT) {
        return calculateSolarPosition(date, latitude, longitude, deltaT);
    }

    @Test
    public void calculateSolarPosition_DeltaT() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -23.450000;
        double longitude = -66.833333;
        double deltaT = 10000;

        // Act
        AzimuthZenithAngle result = calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        when(calculateSolarPosition(date, latitude, longitude, deltaT)).thenReturn(result);
    }

    @Test
    public void calculateSolarPosition_StandardDelta() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -23.450000;
        double longitude = -66.833333;
        double deltaT = 30;

        // Act
        AzimuthZenithAngle result = calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        when(calculateSolarPosition(date, latitude, longitude, deltaT)).thenReturn(result);
    }

    @Test
    public void calculateSolarPosition_StandardDeltaWithPressure() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -23.450000;
        double longitude = -66.833333;
        double deltaT = 30;
        double pressure = 101325;

        // Act
        AzimuthZenithAngle result = calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Assert
        when(calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature)).thenReturn(result);
    }

    @Test
    public void calculateSolarPosition_StandardDeltaWithTemperature() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -23.450000;
        double longitude = -66.833333;
        double deltaT = 30;
        double temperature = 25;

        // Act
        AzimuthZenithAngle result = calculateSolarPosition(date, latitude, longitude, deltaT, temperature);

        // Assert
        when(calculateSolarPosition(date, latitude, longitude, deltaT)).thenReturn(result);
    }

    @Test
    public void calculateSolarPosition_NoDelta() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -23.450000;
        double longitude = -66.833333;

        // Act and Assert
        AzimuthZenithAngle result = calculateSolarPosition(date, latitude, longitude);

        // Assert
        when(calculateSolarPosition(date, latitude, longitude)).thenReturn(result);
    }

}