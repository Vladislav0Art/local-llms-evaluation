package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;

import static java.lang.Math.*;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSolarPosition_InvalidLongitude_ReturnsExpectedNaNAzimuthZenithAngle {

    @Test
    public void calculateSolarPosition_InvalidLongitude_ReturnsExpectedNaNAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 0.0;
        double longitude = Double.NaN;
        double deltaT = 1.0; // minutes
        AzimuthZenithAngle expectedAzimuthZenithAngle = new AzimuthZenithAngle(NaN, NaN);
        AzimuthZenithAngle actualAzimuthZenithAngle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        assertThat(actualAzimuthZenithAngle.getAzimuth(), is(expectedAzimuthZenithAngle.getAzimuth()));
        assertThat(actualAzimuthZenithAngle.getZenith(), is(expectedAzimuthZenithAngle.getZenith()));
    }
}

public class AzimuthZenithAngle {
    private double azimuth;
    private double zenith;

    public AzimuthZenithAngle(double azimuth, double zenith) {
        this.azimuth = azimuth;
        this.zenith = zenith;
    }

    public double getAzimuth() {
        return azimuth;
    }

    public double getZenith() {
        return zenith;
    }

}