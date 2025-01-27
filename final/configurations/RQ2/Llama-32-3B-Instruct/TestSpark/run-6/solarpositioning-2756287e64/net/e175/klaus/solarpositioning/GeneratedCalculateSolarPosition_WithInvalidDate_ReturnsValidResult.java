package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithInvalidDate_ReturnsValidResult {

    @Test
    public void calculateSolarPosition_WithInvalidDate_ReturnsValidResult() {
        ZonedDateTime date = null;
        double latitude = 37.7749;
        double longitude = -122.4194;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, null);
        assertThat(result.getAzimuth(), greaterThan(0));
        assertThat(result.getZenith(), lessThan(90));
    }

}

class AzimuthZenithAngle {
    private double azimuth;
    private double zenith;

    public double getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(double azimuth) {
        this_azimuth = azimuth;
    }

    private double _this_azimuth;

    public double getZenith() {
        return zenith;
    }

    public void setZenith(double zenith) {
        this_zenith = zenith;
    }

}