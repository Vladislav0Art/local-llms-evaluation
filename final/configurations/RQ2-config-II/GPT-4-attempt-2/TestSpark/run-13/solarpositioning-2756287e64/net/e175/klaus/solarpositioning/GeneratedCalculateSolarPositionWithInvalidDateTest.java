package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithInvalidDateTest {

    @Test
    public void calculateSolarPositionWithInvalidDateTest() {
        ZonedDateTime date = null;
        double latitude = 52.52;
        double longitude = 13.4050;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}