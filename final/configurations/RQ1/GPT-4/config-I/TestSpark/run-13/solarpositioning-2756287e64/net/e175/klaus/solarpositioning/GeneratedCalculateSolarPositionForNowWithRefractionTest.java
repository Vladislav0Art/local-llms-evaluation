package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionForNowWithRefractionTest {

    @Test
    public void calculateSolarPositionForNowWithRefractionTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.7128; // New York, USA
        double longitude = -74.0060; // New York, USA
        double deltaT = 69.182; // Delta T for 2021
        double pressure = 1013.5; // Global average sea level pressure
        double temperature = 15.0; // Global average temperature
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}