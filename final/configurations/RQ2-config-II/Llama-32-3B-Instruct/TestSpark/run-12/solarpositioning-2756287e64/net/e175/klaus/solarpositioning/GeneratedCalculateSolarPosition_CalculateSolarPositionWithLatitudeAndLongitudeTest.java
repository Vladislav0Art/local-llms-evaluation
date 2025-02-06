package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.ZonedDateTime;
import java.util.Optional;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionWithLatitudeAndLongitudeTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionWithLatitudeAndLongitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 0, 0);
        assertEquals(Optional.empty(), actual.getAzimuth());
        assertEquals(Optional.empty(), actual.getZenith());
    }

}