package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestTemperatureIsNotPositive {

    @Test
    public void testTemperatureIsNotPositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude, temperature);
        assertThat(result, closeTo(360));
    }

}