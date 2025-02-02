package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition_NoPressureNoTemperature_RandomAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_NoPressureNoTemperature_RandomAzimuthZenithAngle() {
        ZonedDateTime date = Mockito.mock(ZonedDateTime.class);
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertFalse(result.isInvalid());
    }

}