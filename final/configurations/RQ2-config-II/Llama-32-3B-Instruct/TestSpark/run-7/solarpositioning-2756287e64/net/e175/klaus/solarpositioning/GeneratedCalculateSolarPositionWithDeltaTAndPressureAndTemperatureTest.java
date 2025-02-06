package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithDeltaTAndPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithDeltaTAndPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC).plusHours(12.0);
        double latitude = 0.0;
        double longitude = 0.0;
        double pressure = 1000.0;
        double temperature = 30.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, pressure, temperature);

        assertNotNull(result);
    }

}