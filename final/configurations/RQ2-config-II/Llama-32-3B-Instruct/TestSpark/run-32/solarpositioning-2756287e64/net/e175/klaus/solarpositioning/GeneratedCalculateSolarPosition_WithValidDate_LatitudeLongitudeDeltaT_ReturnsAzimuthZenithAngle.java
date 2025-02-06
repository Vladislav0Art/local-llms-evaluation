package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithValidDate_LatitudeLongitudeDeltaT_ReturnsAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_WithValidDate_LatitudeLongitudeDeltaT_ReturnsAzimuthZenithAngle() {
        // given
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 0.1;

        // when
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // then
        assertNotNull(result);
    }

}