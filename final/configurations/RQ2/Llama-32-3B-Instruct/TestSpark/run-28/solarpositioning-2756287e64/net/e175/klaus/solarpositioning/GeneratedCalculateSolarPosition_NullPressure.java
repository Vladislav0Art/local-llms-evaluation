package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.ZoneId;

public class GeneratedCalculateSolarPosition_NullPressure {

    @Test
    public void calculateSolarPosition_NullPressure() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, null, null);
        assertThat(result.getAzimuth(), is(Double.NaN));
    }

}