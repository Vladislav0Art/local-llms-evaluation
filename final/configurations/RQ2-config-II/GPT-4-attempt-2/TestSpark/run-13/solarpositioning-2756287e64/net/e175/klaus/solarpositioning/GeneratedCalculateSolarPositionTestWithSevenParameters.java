package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionTestWithSevenParameters {

    @Test
    public void calculateSolarPositionTestWithSevenParameters() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 52.52;
        double longitude = 13.4050;
        double deltaT = 67.0;
        double pressure = 1013.25;
        double temperature = 15.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertNotNull(result);
    }

}