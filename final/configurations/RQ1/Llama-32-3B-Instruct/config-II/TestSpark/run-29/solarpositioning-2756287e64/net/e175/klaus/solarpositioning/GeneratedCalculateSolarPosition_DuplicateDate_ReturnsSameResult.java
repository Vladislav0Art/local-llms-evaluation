package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_DuplicateDate_ReturnsSameResult {

    @Test
    public void calculateSolarPosition_DuplicateDate_ReturnsSameResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        AzimuthZenithAngle result1 = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        AzimuthZenithAngle result2 = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(result1, result2);
    }

}