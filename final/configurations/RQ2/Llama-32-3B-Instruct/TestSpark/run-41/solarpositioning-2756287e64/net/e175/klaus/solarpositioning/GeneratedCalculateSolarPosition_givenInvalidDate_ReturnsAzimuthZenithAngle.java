package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_givenInvalidDate_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_givenInvalidDate_ReturnsAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = null;
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).equals(new AzimuthZenithAngle(0, 0));
    }

}