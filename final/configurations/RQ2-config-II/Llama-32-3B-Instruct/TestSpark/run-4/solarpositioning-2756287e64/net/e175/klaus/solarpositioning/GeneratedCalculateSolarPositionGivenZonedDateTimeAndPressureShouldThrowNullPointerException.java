package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static java.time.ZoneOffset.UTC;
import static java.util.Arrays.asList;

public class GeneratedCalculateSolarPositionGivenZonedDateTimeAndPressureShouldThrowNullPointerException {

    @Test
    public void calculateSolarPositionGivenZonedDateTimeAndPressureShouldThrowNullPointerException() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, UTC);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double pressure = 1013.25;

        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, null, pressure));
    }

}