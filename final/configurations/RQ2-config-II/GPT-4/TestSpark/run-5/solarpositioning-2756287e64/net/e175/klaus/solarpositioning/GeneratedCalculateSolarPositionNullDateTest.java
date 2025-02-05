package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionNullDateTest {

    @Test
    public void calculateSolarPositionNullDateTest() {
        ZonedDateTime date = null;
        double latitude = 40.7128;
        double longitude = -74.0060;
        double deltaT = 69.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}