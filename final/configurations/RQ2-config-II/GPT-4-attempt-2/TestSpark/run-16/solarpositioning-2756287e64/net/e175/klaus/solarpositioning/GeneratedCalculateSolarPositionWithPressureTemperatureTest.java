package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithPressureTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 35.6895, longitude = 139.6917;
        double deltaT = 69.0, pressure = 1013.25, temperature = 298.15;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull("Testing to see if angle is not null", angle);
    }

}