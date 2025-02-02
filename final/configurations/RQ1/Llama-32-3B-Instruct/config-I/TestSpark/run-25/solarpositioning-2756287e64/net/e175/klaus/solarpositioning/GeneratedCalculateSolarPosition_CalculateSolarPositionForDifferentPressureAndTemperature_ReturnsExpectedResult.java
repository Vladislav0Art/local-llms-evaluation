package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPosition_CalculateSolarPositionForDifferentPressureAndTemperature_ReturnsExpectedResult {

    @Test
    public void calculateSolarPosition_CalculateSolarPositionForDifferentPressureAndTemperature_ReturnsExpectedResult() {
        ZonedDateTime date = ZonedDateTime.now();
        double pressure = 1000.0;
        double temperature = 273.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 50.0, -10.0, 3600.0, pressure, temperature);
        assertTrue(result.getAzimuth() > 0 && result.getAzimuth() < 360);
    }
}

}