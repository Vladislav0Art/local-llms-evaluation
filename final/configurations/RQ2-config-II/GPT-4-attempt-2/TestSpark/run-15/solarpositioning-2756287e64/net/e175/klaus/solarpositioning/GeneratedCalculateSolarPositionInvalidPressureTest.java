package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionInvalidPressureTest {

    @Test
    public void calculateSolarPositionInvalidPressureTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;
        double invalid_pressure = -500.0;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(time, latitude, longitude, deltaT, invalid_pressure, temperature);
    }

}