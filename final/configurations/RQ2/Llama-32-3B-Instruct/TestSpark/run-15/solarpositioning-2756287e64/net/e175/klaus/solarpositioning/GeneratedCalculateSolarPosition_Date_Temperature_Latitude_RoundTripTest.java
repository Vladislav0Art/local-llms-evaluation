package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_Date_Temperature_Latitude_RoundTripTest {

    @Test
    public void calculateSolarPosition_Date_Temperature_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = 45.0;
        double temperature = 20.0;
        AzimuthZenithAngle expectedResult = new AzimuthZenithAngle(15, -25);
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, temperature);
        assertEquals(expectedResult, actualResult);
    }

}