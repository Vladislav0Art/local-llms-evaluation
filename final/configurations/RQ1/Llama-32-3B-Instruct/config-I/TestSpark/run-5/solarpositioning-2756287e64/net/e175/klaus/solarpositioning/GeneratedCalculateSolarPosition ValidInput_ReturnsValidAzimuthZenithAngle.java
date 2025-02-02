package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalculateSolarPosition ValidInput_ReturnsValidAzimuthZenithAngle {

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

}