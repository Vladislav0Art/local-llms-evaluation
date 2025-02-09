package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionInvalidTemperatureTest {

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;
        double pressure = 1000.0;
        double invalid_temperature = -300.0;

        Grena3.calculateSolarPosition(time, latitude, longitude, deltaT, pressure, invalid_temperature);
    }

}