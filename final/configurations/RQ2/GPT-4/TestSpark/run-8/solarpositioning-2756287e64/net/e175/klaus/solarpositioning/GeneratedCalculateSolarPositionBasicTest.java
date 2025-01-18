package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionBasicTest {

    @Test
    public void calculateSolarPositionBasicTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 80.0;
        double longitude = 45.0;
        double deltaT = 5.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}