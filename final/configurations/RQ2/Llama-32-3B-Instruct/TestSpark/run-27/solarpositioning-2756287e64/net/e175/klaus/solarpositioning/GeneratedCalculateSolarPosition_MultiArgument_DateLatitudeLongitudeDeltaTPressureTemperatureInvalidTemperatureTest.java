package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_MultiArgument_DateLatitudeLongitudeDeltaTPressureTemperatureInvalidTemperatureTest {

    @Test
    public void calculateSolarPosition_MultiArgument_DateLatitudeLongitudeDeltaTPressureTemperatureInvalidTemperatureTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10.0;
        double pressure = 101325;
        double temperature = Double.NaN;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}