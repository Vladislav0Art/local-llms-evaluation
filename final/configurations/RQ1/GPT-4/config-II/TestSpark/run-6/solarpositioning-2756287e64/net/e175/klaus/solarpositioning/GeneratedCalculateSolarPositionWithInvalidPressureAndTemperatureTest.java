package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithInvalidPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithInvalidPressureAndTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 10.0;
        double longitude = 10.0;
        double deltaT = 10.0;
        double pressure = -1.0;
        double temperature = -300.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(
                date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
        assertEquals("The azimuth angle should be the same as if pressure and temperature were not provided",
                Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).getAzimuth(),
                result.getAzimuth(), 0.0);
        assertEquals("The zenith angle should be the same as if pressure and temperature were not provided",
                Grena3.calculateSolarPosition(date, latitude, longitude, deltaT).getZenithAngle(),
                result.getZenithAngle(), 0.0);
    }

}