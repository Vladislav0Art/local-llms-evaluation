package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZonedDateTime;
import java.util.OptionalDouble;

public class GeneratedTestCalculateSolarPosition {

    @Test
    public void testCalculateSolarPosition() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 48.8566;
        double longitude = 2.3508;
        AzimuthZenithAngle result = new AzimuthZenithAngle(date, latitude, longitude);

        OptionalDouble azimuth = result.getAzimuth();
        OptionalDouble zenith = result.getZenith();

        assertEquals(azimuth, java.util.Optional.of(1.0), 0.01);
        assertEquals(zenith, java.util.Optional.of(1.0), 0.01);
    }

}