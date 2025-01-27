package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_CalculateForValidDateAndParameters_ReturnsCorrectAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_CalculateForValidDateAndParameters_ReturnsCorrectAzimuthZenithAngle() {
        // arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5236;
        double longitude = 13.4050;
        double deltaT = 10.5;

        // act
        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // assert
        assertEquals(90.1234, azimuthZenithAngle.getAzimuth(), 0.01);
        assertEquals(23.4567, azimuthZenithAngle.getZenith(), 0.01);
    }

}