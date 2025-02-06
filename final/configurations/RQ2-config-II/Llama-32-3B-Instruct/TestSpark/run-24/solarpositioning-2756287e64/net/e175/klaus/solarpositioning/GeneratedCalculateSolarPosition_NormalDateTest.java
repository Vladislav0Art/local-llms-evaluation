package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPosition_NormalDateTest {

    @Test
    public void calculateSolarPosition_NormalDateTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 52.5200;
        double longitude = 13.4050;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertNotNull(result);
    }

}