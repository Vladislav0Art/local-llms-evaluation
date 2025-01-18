package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void calculateSolarPositionWithDefaultParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 35.6895, 139.6917, 67);

        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

    @Test
    public void calculateSolarPositionWithAllParametersTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 35.6895, 139.6917, 67, 1000, 15);

        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

    @Test
    public void calculateSolarPositionWithNullDateTest() {
        Grena3.calculateSolarPosition(null, 35.6895, 139.6917, 67);
    }

    @Test
    public void calculateSolarPositionWithWrongDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        Grena3.calculateSolarPosition(date, 35.6895, 139.6917, -1);
    }

    @Test
    public void calculateSolarPositionWithWrongTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        Grena3.calculateSolarPosition(date, 35.6895, 139.6917, 67, 1000, -300);
    }

    @Test
    public void calculateSolarPositionWithMockedDateTest() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        Mockito.when(date.getYear()).thenReturn(2020);
        Mockito.when(date.getMonthValue()).thenReturn(1);
        Mockito.when(date.getDayOfMonth()).thenReturn(1);
        Mockito.when(date.getHour()).thenReturn(12);
        Mockito.when(date.getMinute()).thenReturn(0);
        Mockito.when(date.getSecond()).thenReturn(0);
        Mockito.when(date.getNano()).thenReturn(0);
        Mockito.when(date.getZone()).thenReturn(ZoneId.of("UTC"));

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 35.6895, 139.6917, 67);

        assertNotNull(result);
        assertTrue(result.getAzimuth() >= 0);
        assertTrue(result.getZenithAngle() >= 0);
    }

}