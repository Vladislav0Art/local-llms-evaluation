package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_WithValidInput {

    @Test
    public void testCalculateSolarPosition_WithValidInput() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749; // San Francisco, CA
        double longitude = -122.4194;
        double deltaT = 1e-5;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Assert
        assertEquals(0.000123456789, result, 0.001);
    }

}