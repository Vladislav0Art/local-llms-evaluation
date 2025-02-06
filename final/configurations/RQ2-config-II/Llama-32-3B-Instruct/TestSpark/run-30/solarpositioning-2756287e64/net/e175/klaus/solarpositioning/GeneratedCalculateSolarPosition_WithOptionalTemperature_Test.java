package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_WithOptionalTemperature_Test {

    @Test
    public void calculateSolarPosition_WithOptionalTemperature_Test() {
        final ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double pressure = 101325;
        double temperature = Double.NaN;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 3600, pressure, Optional.of(temperature));

        assertNotNull(result);
    }

}