package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_WithDateLatitudeLongitudeDeltaTReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithDateLatitudeLongitudeDeltaTReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 8.6;
        double deltaT = 12.0;
        double pressure = 1013;
        double temperature = -20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        //assert
    }

}