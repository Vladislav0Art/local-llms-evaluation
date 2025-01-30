package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionInvalidTemperatureTest {

    @Test
    public void calculateSolarPositionInvalidTemperatureTest() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(utc, 48.856613, 2.352222, 66.783, 1000.0, 300.0);
        assertNotNull(result);
    }

}