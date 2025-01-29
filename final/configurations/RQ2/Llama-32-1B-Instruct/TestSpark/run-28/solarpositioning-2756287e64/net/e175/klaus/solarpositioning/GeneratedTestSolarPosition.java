package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestSolarPosition {

    @Test
    public void testSolarPosition() {
        G Rena3 grena3 = new Grena3();
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 40.7128;
        double azimuthZenithAngle = grena3.calculateAzimuthZenithAngle(date);
        assertThat(azimuthZenithAngle, is(270.0));
    }

}