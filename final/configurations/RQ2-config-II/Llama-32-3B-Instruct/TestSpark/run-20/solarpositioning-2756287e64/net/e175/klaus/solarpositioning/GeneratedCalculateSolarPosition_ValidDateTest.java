package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_ValidDateTest {

    @Test
    public void calculateSolarPosition_ValidDateTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5200;
        double longitude = 13.4051;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10);
        assertNotNull(result);
    }

}