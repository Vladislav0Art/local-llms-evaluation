package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionNoPressureTemperatureTest {

    private static final double DELTA = 1e-3;

    @Test
    public void calculateSolarPositionNoPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2021, 12, 16, 12, 0), ZoneId.of("Z"));
        double latitude = 51.4779;
        double longitude = 0;
        double deltaT = 68.803;

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(189.209, position.getAzimuth(), DELTA);
        assertEquals(25.118, position.getZenithAngle(), DELTA);
    }

}