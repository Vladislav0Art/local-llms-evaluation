package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionInvalidPressureTest {

    @Test
    public void calculateSolarPositionInvalidPressureTest() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 34.052235, -118.243683, 67.072, 3000.0, 20.0);
        assertNotNull(result);
    }

}