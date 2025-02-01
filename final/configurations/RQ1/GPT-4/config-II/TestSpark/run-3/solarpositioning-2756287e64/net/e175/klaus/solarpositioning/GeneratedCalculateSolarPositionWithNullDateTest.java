package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithNullDateTest {

    @Test
    public void calculateSolarPositionWithNullDateTest() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(null, 51.2, 4.4, 69.8);

        assertEquals(0.0, result.getAzimuth(), 0.00001);
        assertEquals(0.0, result.getZenithAngle(), 0.00001);
    }

}