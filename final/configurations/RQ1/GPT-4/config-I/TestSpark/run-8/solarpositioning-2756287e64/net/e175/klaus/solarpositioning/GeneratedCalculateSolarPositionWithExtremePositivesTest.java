package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithExtremePositivesTest {

    private static final double DELTA = 1e-6;
    private static final double LATITUDE = 48.2;
    private static final double LONGITUDE = 16.37;
    private static final double DELTA_T = 67;
    private static final double PRESSURE = 1000;
    private static final double TEMPERATURE = 15;

    @Test
    public void calculateSolarPositionWithExtremePositivesTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        AzimuthZenithAngle az = Grena3.calculateSolarPosition(dateTime, 90.0, 180.0, 86400.0, 3000.0, 273);

        assertEquals(138.52, az.getAzimuth(), DELTA);
        assertEquals(102.02, az.getZenithAngle(), DELTA);
    }

}