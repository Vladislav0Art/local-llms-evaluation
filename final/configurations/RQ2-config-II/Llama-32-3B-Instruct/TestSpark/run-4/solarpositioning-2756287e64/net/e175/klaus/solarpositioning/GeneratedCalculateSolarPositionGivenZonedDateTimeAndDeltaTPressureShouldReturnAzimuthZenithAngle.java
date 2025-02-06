package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static java.time.ZoneOffset.UTC;
import static java.util.Arrays.asList;

public class GeneratedCalculateSolarPositionGivenZonedDateTimeAndDeltaTPressureShouldReturnAzimuthZenithAngle {

    @Test
    public void calculateSolarPositionGivenZonedDateTimeAndDeltaTPressureShouldReturnAzimuthZenithAngle() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 12.5;
        double pressure = 1013.25;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure);
        assertThat(result, is(AzimuthZenithAngle.of(150.0, 45.0)));
    }

}