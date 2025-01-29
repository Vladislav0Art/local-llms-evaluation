package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCalculateSolarPositionLongitudeLongitude {

    @Test
    public void testCalculateSolarPositionLongitudeLongitude() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 1; // minutes

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(AzimuthZenithAngle.SOUTHERN_HEMISPHERIC, result);
    }

}