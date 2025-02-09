package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_WithNoParameters_ReturnsZero {

    @Test
    public void calculateSolarPosition_WithNoParameters_ReturnsZero() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(null, 0.0, 0.0, 0.0);
        assertNotNull(result);
        assertEquals(AzimuthZenithAngle.ZERO, result);
    }

}