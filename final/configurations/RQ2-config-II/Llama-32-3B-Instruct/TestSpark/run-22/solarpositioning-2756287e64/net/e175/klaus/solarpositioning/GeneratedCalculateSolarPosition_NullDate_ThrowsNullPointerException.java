package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_NullDate_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_NullDate_ThrowsNullPointerException() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, latitude, longitude));
    }

}