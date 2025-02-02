package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_NoPressureNoTemperature_RandomAzimuthZenithAngle() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertFalse(result.isInvalid());
    }

    @Test
    public void calculateSolarPosition_InvalidDate_ThrowsIllegalArgumentException() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT));

        assertEquals("Date is invalid", e.getMessage());
    }

    @Test
    public void calculateSolarPosition_InvalidPressure_ThrowsIllegalArgumentException() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, -1.0));

        assertEquals("Pressure is invalid", e.getMessage());
    }

    @Test
    public void calculateSolarPosition_InvalidTemperature_ThrowsIllegalArgumentException() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 3001.0));

        assertEquals("Temperature is invalid", e.getMessage());
    }

    @Test
    public void calculateSolarPosition

    ValidInput_ReturnsValidAzimuthZenithAngle() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 45.0;
        double longitude = 90.0;
        double deltaT = 10.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertTrue(result.isValid());
    }

    @Test
    public void calcT_ValidDate_ReturnsCorrectResult() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double correctResult = 2451545.0;

        when(date.getTime()).thenReturn(correctResult);

        assertEquals(correctResult, Grena3.calcT(date));
    }

}