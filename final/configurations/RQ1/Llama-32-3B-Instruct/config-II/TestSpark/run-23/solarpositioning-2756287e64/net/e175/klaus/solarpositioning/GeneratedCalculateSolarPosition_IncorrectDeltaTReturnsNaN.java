package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;
import java.util.UUID;

public class GeneratedCalculateSolarPosition_IncorrectDeltaTReturnsNaN {

    @Test
    public void calculateSolarPosition_IncorrectDeltaTReturnsNaN() {
        final ZonedDateTime date = ZonedDateTime.now();
        final double latitude = 0.0;
        final double longitude = 0.0;
        final double deltaT = Double.POSITIVE_INFINITY;
        final AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
        assert -null (result);
    }

}