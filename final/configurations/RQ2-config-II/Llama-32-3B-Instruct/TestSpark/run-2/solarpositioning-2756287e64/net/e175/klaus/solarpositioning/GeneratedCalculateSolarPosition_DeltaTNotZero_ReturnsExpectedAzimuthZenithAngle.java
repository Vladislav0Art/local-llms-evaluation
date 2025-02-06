package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_DeltaTNotZero_ReturnsExpectedAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_DeltaTNotZero_ReturnsExpectedAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 1.0; // minutes
        AzimuthZenithAngle expectedAzimuthZenithAngle = new AzimuthZenithAngle(180, 20);
        AzimuthZenithAngle actualAzimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertThat(actualAzimuthZenithAngle.getAzimuth(), is(expectedAzimuthZenithAngle.getAzimuth()));
        assertThat(actualAzimuthZenithAngle.getZenith(), is(expectedAzimuthZenithAngle.getZenith()));
    }

}