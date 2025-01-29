package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_AzimuthAndLatitude {

    @Test
    public void testCalculateSolarPosition_AzimuthAndLatitude() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 15, 12, 0);
        double latitude = 52;

        // Act
        double azimuthAndLatitude = Grena3.calculateSolarAngle(date, latitude);

        // Assert
        assertEquals(270.0, azimuthAndLatitude, 1);
    }

}