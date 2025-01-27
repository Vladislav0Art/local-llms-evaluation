package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_CalculateWithZeroLatitude_ReturnsIncorrectResult {

    @Test
    public void calculateSolarPosition_CalculateWithZeroLatitude_ReturnsIncorrectResult() {
        // arrange
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 0;
        double longitude = 13.4050;
        double deltaT = 10.5;

        // act
        AzimuthZenithAngle azimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // assert
        assertEquals(Double.NaN, azimuthZenithAngle.getAzimuth(), 0.01);
        assertEquals(Double.NaN, azimuthZenithAngle.getZenith(), 0.01);
    }

}