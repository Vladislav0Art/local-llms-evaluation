package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;
import java.time.Month;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSolarPositionWithMockTest {

    @Test
    public void calculateSolarPositionWithMockTest() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        Mockito.when(date.getYear()).thenReturn(2021);
        Mockito.when(date.getMonthValue()).thenReturn(Month.JANUARY.getValue());
        Mockito.when(date.getDayOfMonth()).thenReturn(15);
        Mockito.when(date.getHour()).thenReturn(12);
        Mockito.when(date.getMinute()).thenReturn(0);
        Mockito.when(date.getSecond()).thenReturn(0);
        Mockito.when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);

        double latitude = 45.649;
        double longitude = 13.776;
        double deltaT = 31.5;
        double pressure = 1000;
        double temperature = 15;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);

        assertEquals(213.8680488428108, result.getAzimuth(), 0.000000000001);
        assertEquals(79.68788876066833, result.getZenithAngle(), 0.000000000001);
    }

}