package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_GivenValidDateAndLatLong_ExpectedResult {

    @Test
    public void calculateSolarPosition_GivenValidDateAndLatLong_ExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(1, result.getAzi(), 0.01);
    }

}