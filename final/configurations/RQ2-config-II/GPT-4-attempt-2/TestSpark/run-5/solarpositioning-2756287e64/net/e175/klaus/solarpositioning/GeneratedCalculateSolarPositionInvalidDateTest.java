package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionInvalidDateTest {

    @Test
    public void calculateSolarPositionInvalidDateTest() {
        Grena3.calculateSolarPosition(null, 45.0, 90.0, 67.0);
    }

}