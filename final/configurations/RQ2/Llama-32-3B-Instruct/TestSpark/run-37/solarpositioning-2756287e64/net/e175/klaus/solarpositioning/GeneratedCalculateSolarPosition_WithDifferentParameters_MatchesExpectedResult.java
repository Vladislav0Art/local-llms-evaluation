package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_WithDifferentParameters_MatchesExpectedResult {

    @Test
    public void calculateSolarPosition_WithDifferentParameters_MatchesExpectedResult() {
        double pressure = 101325.0;
        double temperature = -10.0;
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 37.7749, -122.4194, 8.0, pressure, temperature);
        assertNotNull(result);
        assertEquals(AzimuthZenithAngle.DEFAULT, result);
    }

}