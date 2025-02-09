package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionTestWithInvalidLongitude {

    @Test
    public void calculateSolarPositionTestWithInvalidLongitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 51.5074;
        double longitude = 180.1;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}