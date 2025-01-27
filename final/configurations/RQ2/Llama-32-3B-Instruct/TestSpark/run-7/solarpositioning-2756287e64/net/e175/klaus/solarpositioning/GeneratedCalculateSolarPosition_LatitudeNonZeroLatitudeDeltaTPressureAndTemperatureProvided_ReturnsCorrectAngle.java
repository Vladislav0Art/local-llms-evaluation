package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_LatitudeNonZeroLatitudeDeltaTPressureAndTemperatureProvided_ReturnsCorrectAngle {

    @Test
    public void calculateSolarPosition_LatitudeNonZeroLatitudeDeltaTPressureAndTemperatureProvided_ReturnsCorrectAngle() {
        AzimuthZenithAngle expected = new AzimuthZenithAngle(120.0, 25.0);
        assertEquals(expected, Grena3.calculateSolarPosition(ZonedDateTime.now(), 10.0, 20.0, Double.POSITIVE_INFINITY, 1000.0, 20.0));
    }

}