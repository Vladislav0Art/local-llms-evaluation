package net.e175.klaus.solarpositioning;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPositionWithMockAndMockedPressureAndTemperature {

    @Test
    public void testCalculateSolarPositionWithMockAndMockedPressureAndTemperature() {
        // Arrange
        ZonedDateTime mockDate = new ZonedDateTime(2022, 1, 1, 0, 0, 0, ZoneOffset.ofHours(-5));
        double latitude = -33.87;
        double longitude = -114.06;
        double deltaT = 30;

        Mock<ZonedDateTime> mockDateMockedPressureAndTemperature = mock(ZonedDateTime.class);
        when(mockDateMockedPressureAndTemperature.now()).thenReturn(mockDate);

        // Act
        AzimuthZenithAngle azimauthZenithAngle = Grena3.calculateSolarPosition(mockDate, latitude, longitude, deltaT, 1013, 288);

        // Assert
        verify(mockDateMockedPressureAndTemperature).now();
    }

}