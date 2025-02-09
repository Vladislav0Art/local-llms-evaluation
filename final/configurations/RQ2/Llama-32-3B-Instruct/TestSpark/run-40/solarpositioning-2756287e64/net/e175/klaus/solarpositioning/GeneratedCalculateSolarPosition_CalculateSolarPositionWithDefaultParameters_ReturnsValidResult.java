package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.OptionalDouble;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionWithDefaultParameters_ReturnsValidResult {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionWithDefaultParameters_ReturnsValidResult() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 48.8566;
        double longitude = 2.3522;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);
        OptionalDouble azimuth = result.getAzimuth();
        OptionalDouble zenith = result.getZenith();

        if (azimuth.isPresent()) {
            assertEquals(-12.1234, azimuth.getAsDouble(), 0.01);
        } else {
            fail("Azimuth not found");
        }

        if (zenith.isPresent()) {
            assertEquals(23.4567, zenith.getAsDouble(), 0.01);
        } else {
            fail("Zenith not found");
        }
    }

}