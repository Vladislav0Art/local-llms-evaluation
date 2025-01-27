package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_Date_Temperature_Latitude_InvalidInput_RoundTripTest {

    @Test
    public void calculateSolarPosition_Date_Temperature_Latitude_InvalidInput_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = Double.NaN;
        double temperature = 20.0;
        AzimuthZenithAngle expectedResult = null;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, temperature);
        assertEquals(expectedResult, actualResult);
    }

}