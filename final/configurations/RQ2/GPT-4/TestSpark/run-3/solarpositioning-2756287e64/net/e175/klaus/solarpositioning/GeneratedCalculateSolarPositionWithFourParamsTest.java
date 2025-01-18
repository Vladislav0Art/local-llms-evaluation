package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithFourParamsTest {

    @Test
    public void calculateSolarPositionWithFourParamsTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 38.9072;
        double longitude = -77.0369;
        double deltaT = 67.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
    }

}