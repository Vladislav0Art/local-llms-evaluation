package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCalculateSolarPosition_LatitudeLongitude_DeltaT_SolarAngle {

    @Test
    public void testCalculateSolarPosition_LatitudeLongitude_DeltaT_SolarAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 15, 12, 0, 0);
        double latitude = 52.520833;
        double longitude = -13.405556;
        double deltaT = 16; // minutes
        Grena3.SolarPosition solarAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertEquals(37.77, solarAngle.getAzimuth(), 0.01);
    }

}