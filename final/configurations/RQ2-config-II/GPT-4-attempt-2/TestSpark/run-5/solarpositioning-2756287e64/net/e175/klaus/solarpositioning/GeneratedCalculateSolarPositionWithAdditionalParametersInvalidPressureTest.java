package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithAdditionalParametersInvalidPressureTest {

    @Test
    public void calculateSolarPositionWithAdditionalParametersInvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 45.0, 90.0, 67.0, -1.0, 15.0);
    }

}