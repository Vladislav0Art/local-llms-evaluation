package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionDateLatLongDeltaPressureTemperatureTest {

    @Test
    public void calculateSolarPositionDateLatLongDeltaPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneId.of("Z"));
        double latitude = 50.0;
        double longitude = 20.0;
        double deltaT = 5.0;
        double pressure = 1.0;
        double temperature = 25.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}