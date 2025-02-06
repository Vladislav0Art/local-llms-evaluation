package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_TemperatureAndPressure_MissingValues_ThrowsIllegalArgumentException {

    @Test
    public void calculateSolarPosition_TemperatureAndPressure_MissingValues_ThrowsIllegalArgumentException() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -70.0;
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, 30.0, pressure = 1013.25));
    }

}