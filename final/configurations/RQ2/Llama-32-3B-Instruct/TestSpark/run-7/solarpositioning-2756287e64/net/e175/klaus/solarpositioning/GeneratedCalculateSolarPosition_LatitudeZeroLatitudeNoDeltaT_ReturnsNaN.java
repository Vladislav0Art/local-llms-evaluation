package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_LatitudeZeroLatitudeNoDeltaT_ReturnsNaN {

    @Test
    public void calculateSolarPosition_LatitudeZeroLatitudeNoDeltaT_ReturnsNaN() {
        assertEquals(AzimuthZenithAngle.NaN, Grena3.calculateSolarPosition(ZonedDateTime.now(), 0.0, 0.0, 0.0));
    }

}