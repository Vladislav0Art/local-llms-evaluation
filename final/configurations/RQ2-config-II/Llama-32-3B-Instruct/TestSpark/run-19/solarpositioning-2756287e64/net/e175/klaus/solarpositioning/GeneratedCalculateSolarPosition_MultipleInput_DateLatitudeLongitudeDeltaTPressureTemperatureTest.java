package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.atomic.AtomicDouble;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_MultipleInput_DateLatitudeLongitudeDeltaTPressureTemperatureTest {

    @Test
    public void calculateSolarPosition_MultipleInput_DateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4052;
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, 360.0, 1013.25, -20.0);
        assertEquals(270.0, angle.getAzimuth(), 0.01);
        assertEquals(-30.0, angle.getZenith(), 0.01);
    }

}