package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;
import java.time.Month;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionArgumentLength6Test {

    @Test
    public void calculateSolarPositionArgumentLength6Test() {
        ZonedDateTime date = ZonedDateTime.of(2025, Month.MARCH.getValue(), 25, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.649;
        double longitude = 13.776;
        double deltaT = 31.5;
        double pressure = 1000;
        double temperature = 15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(189.6462590445287, result.getAzimuth(), 0);
        assertEquals(49.02290800605819, result.getZenithAngle(), 0);
    }

}