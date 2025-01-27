package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_LatitudeZeroLatitudeDeltaTPressureAndTemperatureProvided_ReturnsCorrectAngle {

    @Test
    public void calculateSolarPosition_LatitudeZeroLatitudeDeltaTPressureAndTemperatureProvided_ReturnsCorrectAngle() {
        AzimuthZenithAngle expected = new AzimuthZenithAngle(45.0, 30.0);
        assertEquals(expected, Grena3.calculateSolarPosition(ZonedDateTime.now(), 0.0, 0.0, Double.POSITIVE_INFINITY, 1000.0, 20.0));
    }

}