package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;
import static java.lang.Math.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

public class GeneratedCalculateSolarPositionWithoutRefractionTest {

    private static final double ASSERT_EQUALS_DOUBLE_DELTA = 0.000000000001;

    @Test
    public void calculateSolarPositionWithoutRefractionTest() {
        ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2023, 3, 25, 12, 15), ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 1.0;
        AzimuthZenithAngle expected = new AzimuthZenithAngle(208.08314967104668, 40.27849599951933);
        AzimuthZenithAngle calculated = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(expected.getAzimuth(), calculated.getAzimuth(), ASSERT_EQUALS_DOUBLE_DELTA);
        assertEquals(expected.getZenithAngle(), calculated.getZenithAngle(), ASSERT_EQUALS_DOUBLE_DELTA);
    }

}