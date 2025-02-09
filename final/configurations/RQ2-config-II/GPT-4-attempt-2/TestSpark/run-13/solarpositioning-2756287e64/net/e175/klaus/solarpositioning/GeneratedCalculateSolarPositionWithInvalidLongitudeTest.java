package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52;
        double longitude = 200.0;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}