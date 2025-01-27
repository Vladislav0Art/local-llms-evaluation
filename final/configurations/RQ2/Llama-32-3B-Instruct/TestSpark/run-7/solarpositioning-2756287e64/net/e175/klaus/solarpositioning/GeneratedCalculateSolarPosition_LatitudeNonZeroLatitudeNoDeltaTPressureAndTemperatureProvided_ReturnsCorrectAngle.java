package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_LatitudeNonZeroLatitudeNoDeltaTPressureAndTemperatureProvided_ReturnsCorrectAngle {

    @Test
    public void calculateSolarPosition_LatitudeNonZeroLatitudeNoDeltaTPressureAndTemperatureProvided_ReturnsCorrectAngle() {
        AzimuthZenithAngle expected = new AzimuthZenithAngle(150.0, 30.0);
        assertEquals(expected, Grena3.calculateSolarPosition(ZonedDateTime.now(), 10.0, 20.0, 0.0, 1000.0, 20.0));
    }

}