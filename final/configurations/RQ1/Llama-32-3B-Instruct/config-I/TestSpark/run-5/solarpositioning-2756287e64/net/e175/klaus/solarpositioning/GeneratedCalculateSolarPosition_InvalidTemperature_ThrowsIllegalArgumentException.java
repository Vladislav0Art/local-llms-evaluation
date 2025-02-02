package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_InvalidTemperature_ThrowsIllegalArgumentException {

    @Test
    public void calculateSolarPosition_InvalidTemperature_ThrowsIllegalArgumentException() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, 3001.0));

        assertEquals("Temperature is invalid", e.getMessage());
    }

}