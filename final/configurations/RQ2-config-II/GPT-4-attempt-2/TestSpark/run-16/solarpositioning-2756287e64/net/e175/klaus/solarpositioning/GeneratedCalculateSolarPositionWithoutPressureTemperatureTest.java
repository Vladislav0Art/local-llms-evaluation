package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithoutPressureTemperatureTest {

    @Test
    public void calculateSolarPositionWithoutPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 35.6895, longitude = 139.6917;
        double deltaT = 69.0;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull("Testing to see if angle is not null", angle);
    }

}