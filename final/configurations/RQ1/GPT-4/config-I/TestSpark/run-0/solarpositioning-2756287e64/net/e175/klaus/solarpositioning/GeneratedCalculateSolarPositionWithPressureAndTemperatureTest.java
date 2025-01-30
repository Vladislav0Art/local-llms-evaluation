package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithPressureAndTemperatureTest {

    @Test
    public void calculateSolarPositionWithPressureAndTemperatureTest() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 40.748817, -73.985428, 68.803, 1000.0, 20.0);
        assertNotNull(result);
    }

}