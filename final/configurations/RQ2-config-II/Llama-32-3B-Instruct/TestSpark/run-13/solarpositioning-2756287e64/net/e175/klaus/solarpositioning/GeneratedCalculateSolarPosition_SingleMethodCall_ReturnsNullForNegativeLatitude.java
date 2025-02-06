package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_SingleMethodCall_ReturnsNullForNegativeLatitude {

    private static Grena3 grena3;

    @BeforeClass
    public static void setUp() {
        grena3 = new Grena3();
    }

    // Test calculateSolarPosition with valid inputs and single method call

    @Test
    public void calculateSolarPosition_SingleMethodCall_ReturnsNullForNegativeLatitude() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = -52.5200;
        double longitude = 13.4050;
        double deltaT = 10;
        AzimuthZenithAngle expected = null;
        AzimuthZenithAngle actual = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(expected, actual);
    }

}