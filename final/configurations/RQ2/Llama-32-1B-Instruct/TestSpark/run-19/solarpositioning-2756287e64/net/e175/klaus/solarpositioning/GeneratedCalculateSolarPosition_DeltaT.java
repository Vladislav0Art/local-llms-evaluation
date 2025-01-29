package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_DeltaT {

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

}