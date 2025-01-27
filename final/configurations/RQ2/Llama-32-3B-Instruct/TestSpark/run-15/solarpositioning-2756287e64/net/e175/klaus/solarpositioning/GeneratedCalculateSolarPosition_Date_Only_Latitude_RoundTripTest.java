package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_Date_Only_Latitude_RoundTripTest {

    @Test
    public void calculateSolarPosition_Date_Only_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 45.0;
        AzimuthZenithAngle expectedResult = new AzimuthZenithAngle(0, 30);
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude);
        assertEquals(expectedResult, actualResult);
    }

}