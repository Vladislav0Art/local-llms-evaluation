package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_CalculateWithInvalidDate {

    @Test
    public void calculateSolarPosition_CalculateWithInvalidDate() {
        // Given
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;

        // When
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Then
        assertNull(result);
    }

}