package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_TimeDeltaZeroTest {

    @Test
    public void calculateSolarPosition_TimeDeltaZeroTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.0;
        double longitude = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        assertNotNull(result);
    }

}