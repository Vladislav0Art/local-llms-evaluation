package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionFirstOverloadInvalidLatitudeTest {

    @Test
    public void calculateSolarPositionFirstOverloadInvalidLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 200.0;
        double longitude = 45.0;
        double deltaT = 70.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}