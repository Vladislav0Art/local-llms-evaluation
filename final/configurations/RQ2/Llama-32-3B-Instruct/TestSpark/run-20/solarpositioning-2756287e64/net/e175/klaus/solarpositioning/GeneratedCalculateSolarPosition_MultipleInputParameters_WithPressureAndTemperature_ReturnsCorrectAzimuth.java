package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_MultipleInputParameters_WithPressureAndTemperature_ReturnsCorrectAzimuth {

    public enum AzimuthZenithAngle {
        ZERO(0.0),
        ONE(1.0);

        private final double value;

        AzimuthZenithAngle(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    @Test
    public void calculateSolarPosition_MultipleInputParameters_WithPressureAndTemperature_ReturnsCorrectAzimuth() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 10.0;
        double pressure = 1013.25; // atm
        double temperature = 20.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
        assertEquals(Grena3.AzimuthZenithAngle.ONE.getValue(), result.getValue(), 1e-9);
    }

}