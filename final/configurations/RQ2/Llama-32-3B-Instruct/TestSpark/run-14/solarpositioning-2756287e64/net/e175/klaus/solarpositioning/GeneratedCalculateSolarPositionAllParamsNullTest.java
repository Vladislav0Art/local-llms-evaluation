package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPositionAllParamsNullTest {

    @Test
    public void calculateSolarPositionAllParamsNullTest() {
        ZonedDateTime date = null;
        double latitude = null;
        double longitude = null;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0, 101325, -20);
        assertNull(result);
    }

}