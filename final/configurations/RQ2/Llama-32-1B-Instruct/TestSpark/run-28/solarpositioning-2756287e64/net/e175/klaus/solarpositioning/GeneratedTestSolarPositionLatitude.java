package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestSolarPositionLatitude {

    @Test
    public void testSolarPositionLatitude() {
        G Rena3 grena3 = new Grena3();
        ZonedDateTime date = ZonedDateTime.now();
        double longitude = -74.0060;
        double azimuthAndLatitude = grena3.calculateAzimuthZenithAngle(date, latitude);
        assertThat(azimuthAndLatitude, is(270.0));
    }

}