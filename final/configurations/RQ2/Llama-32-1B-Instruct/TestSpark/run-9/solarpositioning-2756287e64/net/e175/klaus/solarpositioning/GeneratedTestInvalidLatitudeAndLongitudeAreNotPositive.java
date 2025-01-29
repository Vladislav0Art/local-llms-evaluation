package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestInvalidLatitudeAndLongitudeAreNotPositive {

    @Test
    public void testInvalidLatitudeAndLongitudeAreNotPositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(0, -74.0060, 25);
        assertThat(result, closeTo(360));
    }

}