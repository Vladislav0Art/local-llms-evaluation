package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

import net.e175.klaus.solarpositioning.Grena3;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_EmptyDate {

    @Test
    public void calculateSolarPosition_EmptyDate() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.0;
        double longitude = 10.0;
        double deltaT = 1.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertNotNull(result);
    }

}