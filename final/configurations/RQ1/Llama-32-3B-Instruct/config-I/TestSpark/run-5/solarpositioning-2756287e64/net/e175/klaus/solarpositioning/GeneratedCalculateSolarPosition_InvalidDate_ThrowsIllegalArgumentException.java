package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_InvalidDate_ThrowsIllegalArgumentException {

    @Test
    public void calculateSolarPosition_InvalidDate_ThrowsIllegalArgumentException() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT));

        assertEquals("Date is invalid", e.getMessage());
    }

}