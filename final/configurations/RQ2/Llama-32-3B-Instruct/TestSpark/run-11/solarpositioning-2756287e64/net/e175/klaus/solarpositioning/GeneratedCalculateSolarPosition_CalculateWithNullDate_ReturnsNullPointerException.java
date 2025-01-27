package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPosition_CalculateWithNullDate_ReturnsNullPointerException {

    @Test
    public void calculateSolarPosition_CalculateWithNullDate_ReturnsNullPointerException() {
        // arrange
        ZonedDateTime date = null;
        double latitude = 52.5236;
        double longitude = 13.4050;
        double deltaT = 10.5;

        // act and assert
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT));
    }

}