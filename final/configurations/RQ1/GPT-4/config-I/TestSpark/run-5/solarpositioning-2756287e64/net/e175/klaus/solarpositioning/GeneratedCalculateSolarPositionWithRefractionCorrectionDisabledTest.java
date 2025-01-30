package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithRefractionCorrectionDisabledTest {

    @Test
    public void calculateSolarPositionWithRefractionCorrectionDisabledTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = Double.MIN_VALUE;
        double temperature = -274;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        Assert.assertNotNull(result);
    }

}