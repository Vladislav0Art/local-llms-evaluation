package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPosition_EmptyDate_ReturnsNull {

    @Test
    public void calculateSolarPosition_EmptyDate_ReturnsNull() {
        ZonedDateTime date = null;
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(null, result);
    }

}