package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_DeltaT {

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