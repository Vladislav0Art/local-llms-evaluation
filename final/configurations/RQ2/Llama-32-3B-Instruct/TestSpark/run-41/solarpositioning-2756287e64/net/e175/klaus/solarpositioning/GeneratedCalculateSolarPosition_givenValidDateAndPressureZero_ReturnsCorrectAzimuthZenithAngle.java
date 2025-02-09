package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_givenValidDateAndPressureZero_ReturnsCorrectAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_givenValidDateAndPressureZero_ReturnsCorrectAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;
        double pressure = 0;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure).equals(new AzimuthZenithAngle(0, 0));
    }

}