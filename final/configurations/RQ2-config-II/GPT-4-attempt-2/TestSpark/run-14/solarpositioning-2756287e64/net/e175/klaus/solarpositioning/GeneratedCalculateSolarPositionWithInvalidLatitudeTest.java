package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime date = LocalDateTime.of(2020, 6, 20, 0, 0).atZone(ZoneId.of("UTC"));
        double latitude = 500.1109;  // Invalid value
        double longitude = 8.6821;
        double deltaT = 68.8033;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}