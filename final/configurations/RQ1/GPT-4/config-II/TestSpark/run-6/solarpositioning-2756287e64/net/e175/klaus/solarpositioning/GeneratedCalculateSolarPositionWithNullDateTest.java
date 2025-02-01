package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithNullDateTest {

    @Test
    public void calculateSolarPositionWithNullDateTest() {
        double latitude = 10.0;
        double longitude = 10.0;
        double deltaT = 10.0;
        Grena3.calculateSolarPosition(null, latitude, longitude, deltaT);
    }

}