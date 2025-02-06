package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_CalculateWithNegativeLatitude {

    @Test
    public void calculateSolarPosition_CalculateWithNegativeLatitude() {
        // Given
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -37.7749;
        double longitude = -122.4194;
        double deltaT = 10;

        // When
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // Then
        assertNull(result);
    }

}