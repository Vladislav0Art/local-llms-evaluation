package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionExtremeLatLongTest {

    @Test
    public void calculateSolarPositionExtremeLatLongTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -90.0;
        double longitude = 180.0;
        double deltaT = 5.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}