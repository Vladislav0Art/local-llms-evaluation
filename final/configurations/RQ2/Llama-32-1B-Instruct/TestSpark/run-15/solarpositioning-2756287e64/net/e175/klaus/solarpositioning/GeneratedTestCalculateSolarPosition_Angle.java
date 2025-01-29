package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_Angle {

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

}