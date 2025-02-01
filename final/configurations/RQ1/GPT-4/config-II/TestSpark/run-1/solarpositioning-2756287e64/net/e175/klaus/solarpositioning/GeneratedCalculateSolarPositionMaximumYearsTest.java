package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionMaximumYearsTest {

    private static final double DELTA = 0.001;
    private static final double REFRACTED_DELTA = 0.5;

    @Test
    public void calculateSolarPositionMaximumYearsTest() {
        ZonedDateTime date = ZonedDateTime.of(2110, 12, 31, 12, 0, 0, 0, ZoneId.of("UTC"));
        double latitude = 90.0; // North Pole
        double longitude = 0.0;
        double deltaT = 151.7; // Estimated for 2110

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertEquals(0.0, result.getAzimuth(), DELTA);
        Assert.assertEquals(23.796, result.getZenithAngle(), DELTA);
    }

}