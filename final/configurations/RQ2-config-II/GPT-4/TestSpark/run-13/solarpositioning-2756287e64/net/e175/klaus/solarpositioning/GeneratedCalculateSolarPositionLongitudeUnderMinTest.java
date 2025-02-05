package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionLongitudeUnderMinTest {

    @Test
    public void calculateSolarPositionLongitudeUnderMinTest() {
        ZonedDateTime dt = ZonedDateTime.of(2021, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle pos = Grena3.calculateSolarPosition(dt, 50.0, -200.0, 1.0);
        assertNotNull(pos);
    }

}