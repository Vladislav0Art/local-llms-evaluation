package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_CalculateWithPressureAndTemperature_ReturnsAnglesWithCorrectSign {

    @Test
    public void calculateSolarPosition_CalculateWithPressureAndTemperature_ReturnsAnglesWithCorrectSign() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double pressure = 1023.0;
        double temperature = -10.0;

        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, 0.0, 0.0, 0.0, pressure, temperature);

        assertTrue(angle.getAzimuth() < 0.0);
        assertTrue(angle.getZenith() > 0.0);
    }

}