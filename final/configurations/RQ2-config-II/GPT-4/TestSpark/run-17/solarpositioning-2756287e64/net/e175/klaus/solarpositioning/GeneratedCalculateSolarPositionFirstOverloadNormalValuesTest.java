package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionFirstOverloadNormalValuesTest {

    @Test
    public void calculateSolarPositionFirstOverloadNormalValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 45.0;
        double longitude = 45.0;
        double deltaT = 70.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}