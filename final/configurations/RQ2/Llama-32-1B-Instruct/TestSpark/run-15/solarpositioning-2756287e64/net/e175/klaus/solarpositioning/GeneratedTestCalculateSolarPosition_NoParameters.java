package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSolarPosition_NoParameters {

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

}