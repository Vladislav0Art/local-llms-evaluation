package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class GeneratedCalculateSolarPositionWithFourParamsTest {

    @Test
    public void calculateSolarPositionWithFourParamsTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 48.21;
        double longitude = 16.37;
        double deltaT = 69;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
    }

}