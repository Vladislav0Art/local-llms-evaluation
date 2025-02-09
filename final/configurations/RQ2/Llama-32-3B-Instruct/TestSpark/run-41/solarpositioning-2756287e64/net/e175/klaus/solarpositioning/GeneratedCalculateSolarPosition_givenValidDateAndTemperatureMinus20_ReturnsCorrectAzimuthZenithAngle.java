package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_givenValidDateAndTemperatureMinus20_ReturnsCorrectAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_givenValidDateAndTemperatureMinus20_ReturnsCorrectAzimuthZenithAngle() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 1;
        double temperature = -20;

        // Act
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, temperature).equals(new AzimuthZenithAngle(0, 0));
    }

}