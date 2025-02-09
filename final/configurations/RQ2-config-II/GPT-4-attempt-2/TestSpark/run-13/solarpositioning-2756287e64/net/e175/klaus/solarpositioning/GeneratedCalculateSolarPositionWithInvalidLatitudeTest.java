package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 200.0;
        double longitude = 13.4050;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}