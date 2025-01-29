package net.e175.klaus.solarpositioning;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testSolarPosition() {
        ZonedDateTime date = now();
        double result = 37.0 / 180 * Math.PI;
        assertGreaterEqual(azimuthZenithAngle.NORTHERN_HEMISPHERIC, result);
        assertEquals(AzimuthZenithAngle.NORTHERN_HEMISPHERIC, azimuthZenithAngle.SOUTHERN_HEMISPHERIC, 0.001);

        date = now();
        double result = -22.0 / 180 * Math.PI;
        assertLessThan(azimuthZenithAngle.NORTHERN_HEMISPHERIC, result);
        assertEquals(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, azimuthZenithAngle.NORTHERN_HEMISPHERIC, 0.001);

        date = now();
        double result = -90.0 / 180 * Math.PI;
        assertLessThan(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, result);
        assertEquals(azimuthZenithAngle.NORTHERN_HEMISPHERIC, azimuthZenithAngle.SOUTHERN_HEMISPHERIC, 0.001);

        date = now();
        double result = -120.0 / 180 * Math.PI;
        assertLessThan(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, result);
        assertEquals(azimuthZenithAngle.NORTHERN_HEMISPHERIC, azimuthZenithAngle.SOUTHERN_HEMISPHERIC, 0.001);

        date = now();
        double result = -180.0 / 180 * Math.PI;
        assertLessThan(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, result);
        assertEquals(azimuthZenithAngle.NORTHERN_HEMISPHERIC, azimuthZenithAngle.SOUTHERN_HEMISPHERIC, 0.001);

        date = now();
        double result = -360.0 / 180 * Math.PI;
        assertGreaterEqual(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, result);
    }

    public static class AzimuthZenithAngle {
        private double value;

        public void setValue(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

}