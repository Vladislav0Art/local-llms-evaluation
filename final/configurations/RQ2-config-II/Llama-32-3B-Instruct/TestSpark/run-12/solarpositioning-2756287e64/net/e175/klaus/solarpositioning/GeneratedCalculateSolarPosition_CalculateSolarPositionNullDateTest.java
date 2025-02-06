package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.time.ZonedDateTime;
import java.util.Optional;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionNullDateTest {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionNullDateTest() {
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;
        AzimuthZenithAngle actual = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 0, 0);
        assertNull(actual);
    }

}