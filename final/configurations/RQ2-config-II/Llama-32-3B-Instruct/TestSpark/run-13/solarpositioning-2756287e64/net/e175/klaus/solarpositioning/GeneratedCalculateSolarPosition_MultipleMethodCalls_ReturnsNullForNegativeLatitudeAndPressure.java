package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_MultipleMethodCalls_ReturnsNullForNegativeLatitudeAndPressure {

    private static Grena3 grena3;

    @BeforeClass
    public static void setUp() {
        grena3 = new Grena3();
    }

    // Test calculateSolarPosition with valid inputs and single method call

    @Test
    public void calculateSolarPosition_MultipleMethodCalls_ReturnsNullForNegativeLatitudeAndPressure() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -52.5200;
        double longitude = 13.4050;
        double deltaT = 10;
        double pressure = -1013.25;
        double temperature = 20.00;
        AzimuthZenithAngle expected = null;
        AzimuthZenithAngle actual1 = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(expected, actual1);
        AzimuthZenithAngle actual2 = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertEquals(expected, actual2);
    }

}