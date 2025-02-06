package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionNoDeltaTTest {

    @Test
    public void calculateSolarPositionNoDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 0.0;
        double longitude = 0.0;
        double pressure = 0.0;
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, pressure, temperature);

        assertNotNull(result);
    }

}