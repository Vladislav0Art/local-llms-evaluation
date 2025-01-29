package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedTestLatitudeAndLongitudeArePositive {

    @Test
    public void testLatitudeAndLongitudeArePositive() {
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 25;
        double result = Grena3.calculateSolarPosition(latitude, longitude);
        assertThat(result, closeTo(360));
    }

}