package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithInvalidDateLatitudeLongitudeDeltaT_ThrowsException {

    @Test
    public void calculateSolarPosition_WithInvalidDateLatitudeLongitudeDeltaT_ThrowsException() {
        // Arrange
        ZonedDateTime date = null;
        double latitude = 45.678;
        double longitude = -74.123;
        double deltaT = 10;

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT));
    }

}