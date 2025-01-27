package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithDateLatitudeAndLongitude_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithDateLatitudeAndLongitude_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 8.6;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 12.0);
        //assert
    }

}