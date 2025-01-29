package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_AzimuthZenithAngle {

    @Test
    public void testCalculateSolarPosition_AzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 15, 12, 0);
        double latitude = 52;
        double longitude = -4;

        // Act
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);

        // Assert
        assertEquals(270.0, result.getAzimuth(), 1);
    }

}