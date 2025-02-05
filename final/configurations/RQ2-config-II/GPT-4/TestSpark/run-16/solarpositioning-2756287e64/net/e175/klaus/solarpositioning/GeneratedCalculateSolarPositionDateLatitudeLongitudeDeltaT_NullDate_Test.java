package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaT_NullDate_Test {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaT_NullDate_Test() {
        ZonedDateTime date = null;
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 67;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}