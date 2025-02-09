package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPositionTestWithInvalidLatitude {

    @Test
    public void calculateSolarPositionTestWithInvalidLatitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 91.0;
        double longitude = 0.1278;
        double deltaT = 67.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}