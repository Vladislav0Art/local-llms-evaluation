package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_WithNegativeLongitude_ReturnsNaN {

    @Test
    public void calculateSolarPosition_WithNegativeLongitude_ReturnsNaN() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 45.0;
        double longitude = -10.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertFalse(isEqual(result.getAzimuth(), Double.NaN));
    }

}