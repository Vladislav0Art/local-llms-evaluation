package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_Date_Pressure_Latitude_InvalidInput_RoundTripTest {

    @Test
    public void calculateSolarPosition_Date_Pressure_Latitude_InvalidInput_RoundTripTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.ofHours(-5));
        double latitude = Double.NaN;
        double pressure = 1000.0;
        AzimuthZenithAngle expectedResult = null;
        AzimuthZenithAngle actualResult = Grena3.calculateSolarPosition(date, latitude, pressure);
        assertEquals(expectedResult, actualResult);
    }

}