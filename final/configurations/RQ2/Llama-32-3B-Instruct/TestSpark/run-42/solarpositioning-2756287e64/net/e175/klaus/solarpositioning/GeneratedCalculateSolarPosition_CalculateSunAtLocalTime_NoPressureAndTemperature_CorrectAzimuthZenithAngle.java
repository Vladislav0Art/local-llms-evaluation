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
public class GeneratedCalculateSolarPosition_CalculateSunAtLocalTime_NoPressureAndTemperature_CorrectAzimuthZenithAngle {

    @Mock
    private ZonedDateTime date;

    @Test
    public void calculateSolarPosition_CalculateSunAtLocalTime_NoPressureAndTemperature_CorrectAzimuthZenithAngle() {
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10.5;
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle azimuthZenithAngle = grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assertTrue(azimuthZenithAngle.getAzimuth() > 0 && azimuthZenithAngle.getAzimuth() < 360);
        assertTrue(azimuthZenithAngle.getZenith() >= -90 && azimuthZenithAngle.getZenith() <= 90);
    }

}