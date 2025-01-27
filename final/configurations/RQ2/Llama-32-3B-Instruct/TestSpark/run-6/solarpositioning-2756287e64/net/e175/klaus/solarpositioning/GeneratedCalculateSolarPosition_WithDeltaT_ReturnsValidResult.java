package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_WithDeltaT_ReturnsValidResult {

    @Test
    public void calculateSolarPosition_WithDeltaT_ReturnsValidResult() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC).plusDays(1);
        double latitude = 37.7749;
        double longitude = -122.4194;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10.0);
        assertThat(result.getAzimuth(), greaterThan(0));
        assertThat(result.getZenith(), lessThan(90));
    }

}