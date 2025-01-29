package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestInvalidTemperature {

    @Test
    public void testInvalidTemperature() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(latitude, longitude, "invalid");
        fail("Expected an error to be thrown");
    }

}