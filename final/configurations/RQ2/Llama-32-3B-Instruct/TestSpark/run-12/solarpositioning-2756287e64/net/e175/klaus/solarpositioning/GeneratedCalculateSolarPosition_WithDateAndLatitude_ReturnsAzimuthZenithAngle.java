package net.e175.klaus.solarpositioning;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedCalculateSolarPosition_WithDateAndLatitude_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithDateAndLatitude_ReturnsAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        AzimuthZenithAngle result = new Grena3().calculateSolarPosition(date, latitude);
        // TODO: Add assertion
    }

}