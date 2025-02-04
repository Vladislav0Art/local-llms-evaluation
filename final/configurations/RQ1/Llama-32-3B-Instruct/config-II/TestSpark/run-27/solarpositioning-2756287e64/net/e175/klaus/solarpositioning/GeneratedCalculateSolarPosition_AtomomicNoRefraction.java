package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_AtomomicNoRefraction {

    @Test
    public void calculateSolarPosition_AtomomicNoRefraction() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -37.7749;
        double longitude = -122.4194;
        double deltaT = 86400;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(angle);
    }

}