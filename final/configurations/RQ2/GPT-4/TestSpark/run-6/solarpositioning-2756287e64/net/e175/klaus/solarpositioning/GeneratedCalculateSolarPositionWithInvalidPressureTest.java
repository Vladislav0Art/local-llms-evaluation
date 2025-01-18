package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionWithInvalidPressureTest {

    @Test
    public void calculateSolarPositionWithInvalidPressureTest() {
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneOffset.UTC);
        Grena3.calculateSolarPosition(dateTime, 52.5200, 13.4050, 67, -100, 20);
    }

}