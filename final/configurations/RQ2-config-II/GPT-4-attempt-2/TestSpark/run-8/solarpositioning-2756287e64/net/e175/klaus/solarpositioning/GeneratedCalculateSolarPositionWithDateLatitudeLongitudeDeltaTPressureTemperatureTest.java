package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithDateLatitudeLongitudeDeltaTPressureTemperatureTest {

    @Test
    public void calculateSolarPositionWithDateLatitudeLongitudeDeltaTPressureTemperatureTest() {
        ZonedDateTime testDate = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(testDate, 36, 140, 70, 980, 20);
        assertNotNull(result);
    }

}