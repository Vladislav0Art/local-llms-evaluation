package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestLatitudeAndLongitudeAreNotZero {

    @Test
    public void testLatitudeAndLongitudeAreNotZero() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double result = Grena3.calculateSolarPosition(latitude, longitude);
        assertThat(result, closeTo(360));
    }

}