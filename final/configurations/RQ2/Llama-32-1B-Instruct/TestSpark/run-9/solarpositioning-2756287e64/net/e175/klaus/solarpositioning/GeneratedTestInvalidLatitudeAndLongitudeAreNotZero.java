package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestInvalidLatitudeAndLongitudeAreNotZero {

    @Test
    public void testInvalidLatitudeAndLongitudeAreNotZero() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(latitude, 0, 25);
        assertThat(result, closeTo(360));
    }

}