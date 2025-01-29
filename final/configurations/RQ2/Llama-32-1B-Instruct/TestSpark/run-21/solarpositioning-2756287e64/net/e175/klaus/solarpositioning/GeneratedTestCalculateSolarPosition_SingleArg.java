package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition_SingleArg {

    @Test
    public void testCalculateSolarPosition_SingleArg() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 1e-5;

        // Act and Assert
        assertEquals(0.000123456789, Grena3.calculateSolarPosition(date, latitude, longitude, deltaT), 0.001);
    }

}