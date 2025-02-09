package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 200.0;
        double longitude = 0.984;
        double deltaT = 20.2342;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}