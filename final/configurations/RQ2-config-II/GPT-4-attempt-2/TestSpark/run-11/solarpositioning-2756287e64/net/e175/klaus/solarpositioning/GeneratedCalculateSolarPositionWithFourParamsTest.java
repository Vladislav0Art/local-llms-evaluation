package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithFourParamsTest {

    @Test
    public void calculateSolarPositionWithFourParamsTest() {
        final ZonedDateTime date = ZonedDateTime.of(2022, 5, 12, 15, 30, 0, 0, ZoneOffset.UTC);
        final double latitude = 45.0;
        final double longitude = 90.0;
        final double deltaT = 69.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertNotNull(result);
    }

}