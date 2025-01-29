package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_StandardDeltaWithTemperature {

    private AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                      final double longitude, final double deltaT) {
        return calculateSolarPosition(date, latitude, longitude, deltaT);
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

}