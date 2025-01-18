package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionInvalidLatitudeTest {

    private static final double DELTA = 0.00001;

    @Test
    public void calculateSolarPositionInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 200.0;
        double longitude = 13.4050;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}