package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_NoParameters_ReturnsDefaultValues {

    @Test
    public void calculateSolarPosition_NoParameters_ReturnsDefaultValues() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(null, 0.0, 0.0, 0.0);
        assertEquals(Grena3.AZIMUTH_ZENITH_ANGLE_DEFAULT, result.getAzimuth(), 0.001);
        assertEquals(Grena3.ZENITH_ANGLE_DEFAULT, result.getZenith(), 0.001);
    }

}