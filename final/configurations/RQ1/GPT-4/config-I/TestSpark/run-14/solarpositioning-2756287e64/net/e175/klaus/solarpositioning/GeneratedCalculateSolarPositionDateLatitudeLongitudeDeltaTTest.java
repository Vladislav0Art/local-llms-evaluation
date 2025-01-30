package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import org.junit.Test;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaTTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 68.8033;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}