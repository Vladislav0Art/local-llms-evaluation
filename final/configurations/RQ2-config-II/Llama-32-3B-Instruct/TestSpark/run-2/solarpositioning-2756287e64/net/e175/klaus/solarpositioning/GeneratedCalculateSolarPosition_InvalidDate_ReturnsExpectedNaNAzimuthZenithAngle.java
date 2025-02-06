package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_InvalidDate_ReturnsExpectedNaNAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_InvalidDate_ReturnsExpectedNaNAzimuthZenithAngle() {
        ZonedDateTime date = null;
        double latitude = 0.0;
        double longitude = 0.0;
        AzimuthZenithAngle expectedAzimuthZenithAngle = new AzimuthZenithAngle(NaN, NaN);
        AzimuthZenithAngle actualAzimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, 0.0);

        assertThat(actualAzimuthZenithAngle.getAzimuth(), is(expectedAzimuthZenithAngle.getAzimuth()));
        assertThat(actualAzimuthZenithAngle.getZenith(), is(expectedAzimuthZenithAngle.getZenith()));
    }

}