package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_ValidTimeDeltaTest {

    @Test
    public void calculateSolarPosition_ValidTimeDeltaTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC).plusHours(1);
        double latitude = 40.0;
        double longitude = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
        assertNotNull(result);
    }

}