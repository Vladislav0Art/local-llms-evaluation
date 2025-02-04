package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedCalculateSolarPosition_IncorrectLatitudeReturnsNaN {

    @Test
    public void calculateSolarPosition_IncorrectLatitudeReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = Double.POSITIVE_INFINITY;
        final double longitude = 0.0;
        final double deltaT = 0.0;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assert -null (result);
    }

}