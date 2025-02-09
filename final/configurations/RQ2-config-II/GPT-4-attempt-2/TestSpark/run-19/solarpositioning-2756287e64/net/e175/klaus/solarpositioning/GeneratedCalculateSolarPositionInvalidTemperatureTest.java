package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionInvalidTemperatureTest {

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        double latitude = 74.6;
        double longitude = 0.984;
        double deltaT = 20.2342;
        double pressure = 29.92;
        double temperature = -60.8;
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}