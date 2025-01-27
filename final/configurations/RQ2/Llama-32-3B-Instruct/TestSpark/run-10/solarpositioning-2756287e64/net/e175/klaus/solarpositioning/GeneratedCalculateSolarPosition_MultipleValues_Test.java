package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;

public class GeneratedCalculateSolarPosition_MultipleValues_Test {

    @Test
    public void calculateSolarPosition_MultipleValues_Test() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.0;
        double longitude = -120.5;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10.0, 20.0, 30.0);
        assertNotNull(result);
    }

}