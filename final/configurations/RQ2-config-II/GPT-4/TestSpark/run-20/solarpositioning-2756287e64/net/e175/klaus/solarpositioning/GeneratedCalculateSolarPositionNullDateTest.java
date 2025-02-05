package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionNullDateTest {

    @Test
    public void calculateSolarPositionNullDateTest() {
        ZonedDateTime date = null;
        double latitude = 50.0;
        double longitude = 50.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, 1.0);
    }

}