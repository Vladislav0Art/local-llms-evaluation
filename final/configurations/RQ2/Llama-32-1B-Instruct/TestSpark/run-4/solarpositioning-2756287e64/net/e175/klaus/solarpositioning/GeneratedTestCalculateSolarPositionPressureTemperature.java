package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCalculateSolarPositionPressureTemperature {

    @Test
    public void testCalculateSolarPositionPressureTemperature() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 1; // minutes

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 1000, 288); // mbar, K

        assertEquals(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, result);
    }

}