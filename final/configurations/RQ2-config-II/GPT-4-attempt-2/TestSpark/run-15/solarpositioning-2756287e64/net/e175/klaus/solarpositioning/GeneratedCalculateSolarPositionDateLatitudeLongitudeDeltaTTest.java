package net.e175.klaus.solarpositioning;

import org.junit.Test;
import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionDateLatitudeLongitudeDeltaTTest {

    @Test
    public void calculateSolarPositionDateLatitudeLongitudeDeltaTTest() {
        ZonedDateTime time = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneId.systemDefault());
        double latitude = 60.0;
        double longitude = 24.0;
        double deltaT = 68.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(time, latitude, longitude, deltaT);
        assertNotNull(result);
    }

}