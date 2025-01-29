package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_NoDelta {

    private AzimuthZenithAngle calculateSolarPosition(final ZonedDateTime date, final double latitude,
                                                      final double longitude, final double deltaT) {
        return calculateSolarPosition(date, latitude, longitude, deltaT);
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