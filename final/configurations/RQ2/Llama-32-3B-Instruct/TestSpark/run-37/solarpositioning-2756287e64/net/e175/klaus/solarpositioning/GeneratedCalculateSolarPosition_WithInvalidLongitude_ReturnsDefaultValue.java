package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_WithInvalidLongitude_ReturnsDefaultValue {

    @Test
    public void calculateSolarPosition_WithInvalidLongitude_ReturnsDefaultValue() {
        double invalidLongitude = Double.POSITIVE_INFINITY;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(ZonedDateTime.now(ZoneOffset.UTC), 0.0, invalidLongitude, 0.0);
        assertNotNull(result);
        assertEquals(AzimuthZenithAngle.DEFAULT, result);
    }

}