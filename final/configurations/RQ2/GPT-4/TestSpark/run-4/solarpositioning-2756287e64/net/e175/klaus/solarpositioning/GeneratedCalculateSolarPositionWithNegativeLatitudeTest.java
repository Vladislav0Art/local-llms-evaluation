package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.*;

public class GeneratedCalculateSolarPositionWithNegativeLatitudeTest {

    @Test
    public void calculateSolarPositionWithNegativeLatitudeTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, -50, 20, 69);
        assertNotNull(result);
    }

}