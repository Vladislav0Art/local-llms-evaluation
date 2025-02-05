package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionAllVariablesTest {

    @Test
    public void calculateSolarPositionAllVariablesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 35.6895;
        double longitude = 139.6917;
        double deltaT = 0.30;
        double pressure = 1;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        Assert.assertNotNull("Result must not be null", result);
        Assert.assertTrue("Azimuth angle must be positive", result.getAzimuth() >= 0);
        Assert.assertTrue("Zenith angle must be positive", result.getZenithAngle() >= 0);
    }

}