package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_givenLatitudeOutsideAllowedRange_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_givenLatitudeOutsideAllowedRange_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90;
        double longitude = 2.3522;
        double deltaT = 1;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).equals(new AzimuthZenithAngle(0, 0));
    }

}