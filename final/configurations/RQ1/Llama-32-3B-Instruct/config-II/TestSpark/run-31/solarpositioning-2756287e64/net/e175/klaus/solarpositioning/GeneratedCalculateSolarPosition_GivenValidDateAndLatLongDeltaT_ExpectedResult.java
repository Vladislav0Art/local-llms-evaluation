package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_GivenValidDateAndLatLongDeltaT_ExpectedResult {

    @Test
    public void calculateSolarPosition_GivenValidDateAndLatLongDeltaT_ExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 86400; // seconds
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(1, result.getAzi(), 0.01);
    }

}