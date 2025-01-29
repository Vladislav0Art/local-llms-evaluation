package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCalculateSolarPosition_04 {

    @Test
    public void testCalculateSolarPosition_04() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = -1.234567890123456789;
        double longitude = -0.9876543210987654321;
        double deltaT = 3600000; // 1 hour

        // Act and Assert
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(45.0, Math.toRadians(result.getAzimuthZenithAngle()), 2);
    }

}