package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithRefractionCorrectionTest {

    @Test
    public void calculateSolarPositionWithRefractionCorrectionTest() {
        ZoneId zoneId = ZoneId.of("GMT");
        ZonedDateTime date = ZonedDateTime.of(2010, 1, 1, 0, 0, 0, 0, zoneId);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 1000;
        double temperature = 20;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(Double.MIN_VALUE, result.getAzimuth(), 0.01);
        assertEquals(Double.MIN_VALUE, result.getZenithAngle(), 0.01);
    }

}