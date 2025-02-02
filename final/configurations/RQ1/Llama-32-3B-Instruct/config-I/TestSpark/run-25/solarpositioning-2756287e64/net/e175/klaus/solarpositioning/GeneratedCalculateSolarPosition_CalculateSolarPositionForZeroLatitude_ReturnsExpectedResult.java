package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionForZeroLatitude_ReturnsExpectedResult {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionForZeroLatitude_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = -10.0;
        double deltaT = 3600.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(180, (int) result.getAzimuth());
    }

}