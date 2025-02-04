package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_AtomomicWithRefraction {

    @Test
    public void calculateSolarPosition_AtomomicWithRefraction() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -37.7749;
        double longitude = -122.4194;
        double deltaT = 86400;
        double pressure = 1013.25;
        double temperature = 20;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(angle);
    }

}