package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;
import java.time.Month;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionArgumentLength4Test {

    @Test
    public void calculateSolarPositionArgumentLength4Test() {
        ZonedDateTime date = ZonedDateTime.of(2025, Month.MARCH.getValue(), 25, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 45.649;
        double longitude = 13.776;
        double deltaT = 31.5;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(189.58868122672738, result.getAzimuth(), 0);
        assertEquals(48.979527079712904, result.getZenithAngle(), 0);
    }

}