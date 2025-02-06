package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_DeltaTZero_ReturnsExpectedAzimuthZenithAngleWithPressureAndTemperature {

    @Test
    public void calculateSolarPosition_DeltaTZero_ReturnsExpectedAzimuthZenithAngleWithPressureAndTemperature() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double pressure = 1013.25; // hPa
        double temperature = 20.0; // °C
        AzimuthZenithAngle expectedAzimuthZenithAngle = new AzimuthZenithAngle(180, 20);
        AzimuthZenithAngle actualAzimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0, pressure, temperature);

        assertThat(actualAzimuthZenithAngle.getAzimuth(), is(expectedAzimuthZenithAngle.getAzimuth()));
        assertThat(actualAzimuthZenithAngle.getZenith(), is(expectedAzimuthZenithAngle.getZenith()));
    }

}