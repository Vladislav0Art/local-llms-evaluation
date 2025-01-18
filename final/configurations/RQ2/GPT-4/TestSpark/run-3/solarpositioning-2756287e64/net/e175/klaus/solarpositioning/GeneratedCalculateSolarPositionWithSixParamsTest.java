package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithSixParamsTest {

    @Test
    public void calculateSolarPositionWithSixParamsTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 49.2827;
        double longitude = -123.1207;
        double deltaT = 69.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        Assert.assertNotNull(result);
    }

}