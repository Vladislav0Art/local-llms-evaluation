package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaT_ValidInputs_Test {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaT_ValidInputs_Test() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 42.3601;
        double longitude = -71.0589;
        double deltaT = 67;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}