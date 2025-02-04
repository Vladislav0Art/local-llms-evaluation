package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_GivenInvalidPressureTemperature_ExpectedNoResult {

    @Test
    public void calculateSolarPosition_GivenInvalidPressureTemperature_ExpectedNoResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, -1, -273);
        assertEquals(0, result.getAzi(), 0.01);
    }

}