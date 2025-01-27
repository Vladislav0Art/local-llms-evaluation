package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_Date_InvalidInput_Temperature_Latitude_RoundTripTest {

    @Test
    public void calculateSolarPosition_Date_InvalidInput_Temperature_Latitude_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = Double.NaN;
        double temperature = Double.NaN;
        AzimuthZenithAngle expectedResult = null;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, -10.0, 0.0, 1000.0, temperature);
        assertEquals(expectedResult, actualResult);
    }

}