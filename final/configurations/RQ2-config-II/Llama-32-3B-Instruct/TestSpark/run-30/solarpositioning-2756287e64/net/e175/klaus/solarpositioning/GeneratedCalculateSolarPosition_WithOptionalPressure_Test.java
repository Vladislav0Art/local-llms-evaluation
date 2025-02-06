package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

public class GeneratedCalculateSolarPosition_WithOptionalPressure_Test {

    @Test
    public void calculateSolarPosition_WithOptionalPressure_Test() {
        final ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double pressure = Double.NaN;
        double temperature = 18.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 3600, Optional.of(pressure), temperature);

        assertNotNull(result);
    }

}