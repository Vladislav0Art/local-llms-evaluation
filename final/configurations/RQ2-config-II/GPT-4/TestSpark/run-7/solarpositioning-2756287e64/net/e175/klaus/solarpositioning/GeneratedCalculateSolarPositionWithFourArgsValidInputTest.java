package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedCalculateSolarPositionWithFourArgsValidInputTest {

    @Test
    public void calculateSolarPositionWithFourArgsValidInputTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 9, 20, 0, 0, 0, 0, ZoneId.of("Z"));
        double latitude = 20.0;
        double longitude = 30.0;
        double deltaT = 1.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        Assert.assertNotNull(result);
    }

}