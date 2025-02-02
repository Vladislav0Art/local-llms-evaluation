package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_WithInvalidPressure_ReturnsDefaultResult {

    @Mock
    private ZonedDateTime date;

    @Test
    public void calculateSolarPosition_WithInvalidPressure_ReturnsDefaultResult() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 3600.0;

        Mockito.when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);
        grena3 = new Grena3();

        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertEquals(90.0, result.getAzimuth(), 1e-6);
    }

}