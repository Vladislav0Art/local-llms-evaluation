package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.ZoneId;

public class GeneratedCalculateSolarPosition_CalculateWithTemperature {

    @Test
    public void calculateSolarPosition_CalculateWithTemperature() {
        ZonedDateTime date = ZonedDateTime.of(2022, 6, 21, 12, 0, 0, ZoneOffset.UTC);
        double latitude = 40.7128;
        double longitude = -74.0060;
        double temperature = 20;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, 10, 101325, temperature);
        assertThat(result.getAzimuth(), is(280.0));
    }

}