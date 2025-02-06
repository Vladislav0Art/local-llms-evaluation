package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_InvalidLatitude_ReturnsExpectedNaNAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_InvalidLatitude_ReturnsExpectedNaNAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = Double.NaN;
        double longitude = 0.0;
        double deltaT = 1.0; // minutes
        AzimuthZenithAngle expectedAzimuthZenithAngle = new AzimuthZenithAngle(NaN, NaN);
        AzimuthZenithAngle actualAzimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertThat(actualAzimuthZenithAngle.getAzimuth(), is(expectedAzimuthZenithAngle.getAzimuth()));
        assertThat(actualAzimuthZenithAngle.getZenith(), is(expectedAzimuthZenithAngle.getZenith()));
    }

}