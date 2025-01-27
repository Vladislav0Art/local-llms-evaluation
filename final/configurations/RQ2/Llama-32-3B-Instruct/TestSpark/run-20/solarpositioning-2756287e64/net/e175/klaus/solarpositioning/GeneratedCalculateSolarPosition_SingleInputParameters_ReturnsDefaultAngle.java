package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_SingleInputParameters_ReturnsDefaultAngle {

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
    public void calculateSolarPosition_SingleInputParameters_ReturnsDefaultAngle() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(ZonedDateTime.now(), 0.0, 0.0, 0.0);
        assertNotNull(result);
        assertEquals(Grena3.AzimuthZenithAngle.ZERO.getValue(), result.getValue(), 1e-9);
    }

}