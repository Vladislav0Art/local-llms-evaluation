package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestCalculateSolarPosition {

    public double calculateSolarPosition(double latitude, double longitude, int deltaT) {
        return Math.sqrt(Math.pow(latitude * Math.sin(longitude), 2) + Math.cos(latitude) * Math.cos(longitude) * Math.pow(deltaT, 2));
    }

}

class TestSolarPositionCalculatingFunctions {

    @Test
    public void testCalculateSolarPosition() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        int deltaT = 30;

        double expectedSolarPosition = 23.4396;
        double actualSolarPosition = calculator.calculateSolarPosition(latitude, longitude, deltaT);

        assertTrue(Math.abs(expectedSolarPosition - actualSolarPosition) < Double.MIN_VALUE / 10.0);
    }

}