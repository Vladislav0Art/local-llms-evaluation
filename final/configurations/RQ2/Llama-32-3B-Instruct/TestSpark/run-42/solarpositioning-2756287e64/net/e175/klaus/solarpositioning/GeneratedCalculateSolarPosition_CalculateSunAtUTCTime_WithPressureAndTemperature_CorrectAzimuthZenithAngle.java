package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_CalculateSunAtUTCTime_WithPressureAndTemperature_CorrectAzimuthZenithAngle {

    @Mock
    private ZonedDateTime date;

    @Test
    public void calculateSolarPosition_CalculateSunAtUTCTime_WithPressureAndTemperature_CorrectAzimuthZenithAngle() {
        date = Mockito.mock(ZonedDateTime.class);
        when(date.withZoneSameInstant(ZoneOffset.UTC)).thenReturn(date);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10.5;
        double pressure = 1013.25;
        double temperature = 20.0;
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle azimuthZenithAngle = grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertTrue(azimuthZenithAngle.getAzimuth() > 0 && azimuthZenithAngle.getAzimuth() < 360);
        assertTrue(azimuthZenithAngle.getZenith() >= -90 && azimuthZenithAngle.getZenith() <= 90);
    }

}