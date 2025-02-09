package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithAdditionalParametersValidTest {

    @Test
    public void calculateSolarPositionWithAdditionalParametersValidTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = 90.0;
        double deltaT = 67.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        Assert.assertNotNull(result);
    }

}