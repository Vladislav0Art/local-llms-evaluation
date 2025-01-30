package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithMaximumDeltaTTest {

    @Test
    public void calculateSolarPositionWithMaximumDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 90.0;
        double longitude = 180.0;
        double deltaT = Double.MAX_VALUE;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        Assert.assertNotNull(result);
    }

}