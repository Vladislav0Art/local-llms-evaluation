package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarAngleWithLatitudeAndLongitude {

    @Test
    public void testCalculateSolarAngleWithLatitudeAndLongitude() {
        // Arrange
        ZonedDateTime date = new ZonedDateTime(2022, 1, 15, 12, 0);
        double latitude = 52;
        double longitude = -4;

        // Act
        double[] result = Grena3.calculateSolarAngle(date, latitude, longitude);

        // Assert
        assertEquals(270.0, result[0], 1);
    }

}