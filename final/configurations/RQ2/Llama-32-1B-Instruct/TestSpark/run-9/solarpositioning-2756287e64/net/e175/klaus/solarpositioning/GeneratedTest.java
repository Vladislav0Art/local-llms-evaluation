package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTest {

    @Test
    public void testSolarPosition() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude, temperature);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testInvalidTemperature() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double invalidTemperature = 30;
        try {
            Grena3.calculateSolarPosition(latitude, longitude, invalidTemperature);
        } catch (Exception e) {
            fail("Expected an error to be thrown");
        }
    }

    @Test
    public void testLatitudeAndLongitudeAreNotZero() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(latitude, longitude);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testLongitudeIsNegative() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude, temperature);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testTemperatureIsNotPositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude, temperature);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testLatitudeAndLongitudeArePositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testLongitudeIsNegativeAndLatitudePositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude, temperature);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testInvalidLatitudeAndLongitudeAreNotZero() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(latitude, 0, 25);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testInvalidLatitudeAndLongitudeAreNotPositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(0, -74.0060, 25);
        assertThat(result, closeTo(360));
    }

    @Test
    public void testInvalidTemperature() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(latitude, longitude, "invalid");
        fail("Expected an error to be thrown");
    }

}