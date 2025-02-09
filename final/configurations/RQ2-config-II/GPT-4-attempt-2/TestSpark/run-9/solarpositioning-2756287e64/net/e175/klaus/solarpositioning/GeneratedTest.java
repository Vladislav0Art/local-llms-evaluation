package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionEightParamTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 53.5511;
        double longitude = 9.9937;
        double deltaT = 69.0;
        double pressure = 1013.25;
        double temperature = 273.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Asserting that the result is not null
        assertNotNull(result);

        // Asserting that azimuth and zenith angle are within acceptable ranges
        assertTrue(result.getAzimuth() >= 0 && result.getAzimuth() <= 360);
        assertTrue(result.getZenithAngle() >= 0 && result.getZenithAngle() <= 90);
    }

    @Test
    public void calculateSolarPositionFiveParamTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 53.5511;
        double longitude = 9.9937;
        double deltaT = 69.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Asserting that the result is not null
        assertNotNull(result);

        // Asserting that azimuth and zenith angle are within acceptable ranges
        assertTrue(result.getAzimuth() >= 0 && result.getAzimuth() <= 360);
        assertTrue(result.getZenithAngle() >= 0 && result.getZenithAngle() <= 90);
    }

    @Test
    public void calculateSolarPositionWithIllegalLatitudeTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 100.0, 180.0, 68.0);
    }

    @Test
    public void calculateSolarPositionWithIllegalLongitudeTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 45.0, 200.0, 68.0);
    }

    @Test
    public void calculateSolarPositionWithNegativeDeltaTTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 45.0, 180.0, -10.0);
    }

    @Test
    public void calculateSolarPositionWithIllegalPressureTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 45.0, 180.0, 68.0, -1.0, 300.0);
    }

    @Test
    public void calculateSolarPositionWithIllegalTemperatureTest() {
        Grena3.calculateSolarPosition(ZonedDateTime.now(), 45.0, 180.0, 68.0, 1013.25, -50.0);
    }

}