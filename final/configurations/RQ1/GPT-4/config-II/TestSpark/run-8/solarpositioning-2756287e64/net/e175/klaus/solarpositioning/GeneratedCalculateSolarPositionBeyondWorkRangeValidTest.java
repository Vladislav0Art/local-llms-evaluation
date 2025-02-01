package net.e175.klaus.solarpositioning;

import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionBeyondWorkRangeValidTest {

    @Test
    public void calculateSolarPositionBeyondWorkRangeValidTest() {
        ZonedDateTime date = ZonedDateTime.of(2200, 4, 12, 6, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 36.72016;
        double longitude = -4.42034;
        double deltaT = 64.8;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
    }

}