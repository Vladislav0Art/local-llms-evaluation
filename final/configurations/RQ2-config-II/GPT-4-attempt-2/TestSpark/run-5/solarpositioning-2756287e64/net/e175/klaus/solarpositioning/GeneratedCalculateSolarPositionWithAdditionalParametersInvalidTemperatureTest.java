package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionWithAdditionalParametersInvalidTemperatureTest {

    @Test
    public void calculateSolarPositionWithAdditionalParametersInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2000, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        Grena3.calculateSolarPosition(date, 45.0, 90.0, 67.0, 1013.25, -274.0);
    }

}