package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithInvalidLongitudeTest {

    @Test
    public void calculateSolarPositionWithInvalidLongitudeTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(dateTime, 52.5200, 200.0, 67);
    }

}