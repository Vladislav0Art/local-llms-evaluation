package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithSixParamsTest {

    @Test
    public void calculateSolarPositionWithSixParamsTest() {
        final ZonedDateTime date = ZonedDateTime.of(2022, 5, 12, 15, 30, 0, 0, ZoneOffset.UTC);
        final double latitude = 45.0;
        final double longitude = 90.0;
        final double deltaT = 69.0;
        final double pressure = 1013.0;
        final double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}