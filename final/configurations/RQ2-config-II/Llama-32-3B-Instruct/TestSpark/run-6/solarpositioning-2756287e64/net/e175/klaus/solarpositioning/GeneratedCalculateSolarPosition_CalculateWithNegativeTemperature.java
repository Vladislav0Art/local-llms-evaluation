package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_CalculateWithNegativeTemperature {

    @Test
    public void calculateSolarPosition_CalculateWithNegativeTemperature() {
        // Given
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10;
        double pressure = 101325;
        double temperature = -298;

        // When
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        // Then
        assertNull(result);
    }

}