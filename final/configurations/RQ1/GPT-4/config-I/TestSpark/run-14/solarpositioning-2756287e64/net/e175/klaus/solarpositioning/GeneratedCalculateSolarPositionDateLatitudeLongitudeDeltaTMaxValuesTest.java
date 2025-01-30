package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import org.junit.Test;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaTMaxValuesTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTMaxValuesTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 90;
        double longitude = 180;
        double deltaT = 2000;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}