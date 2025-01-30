package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 91.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        // Latitude out of range should throw IllegalArgumentException
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}