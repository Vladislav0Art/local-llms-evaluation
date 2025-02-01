package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionMinimumYearsTest {

    private static final double DELTA = 0.001;
    private static final double REFRACTED_DELTA = 0.5;

    @Test
    public void calculateSolarPositionMinimumYearsTest() {
        ZonedDateTime date = ZonedDateTime.of(2010, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = -90.0; // South Pole
        double longitude = 0.0;
        double deltaT = 66.3; // For 2010

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertEquals(180.001, result.getAzimuth(), DELTA);
        Assert.assertEquals(22.454, result.getZenithAngle(), DELTA);
    }

}