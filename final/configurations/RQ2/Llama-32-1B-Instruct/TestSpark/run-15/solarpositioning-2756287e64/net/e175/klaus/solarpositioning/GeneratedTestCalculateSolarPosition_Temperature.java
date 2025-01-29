package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_Temperature {

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

}