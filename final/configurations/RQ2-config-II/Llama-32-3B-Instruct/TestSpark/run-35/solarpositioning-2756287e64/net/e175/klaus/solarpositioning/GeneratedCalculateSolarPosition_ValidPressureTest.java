package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_ValidPressureTest {

    @Test
    public void calculateSolarPosition_ValidPressureTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 40.0;
        double longitude = 20.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 1.0, 100.0, 20.0);
        assertNotNull(result);
    }

}