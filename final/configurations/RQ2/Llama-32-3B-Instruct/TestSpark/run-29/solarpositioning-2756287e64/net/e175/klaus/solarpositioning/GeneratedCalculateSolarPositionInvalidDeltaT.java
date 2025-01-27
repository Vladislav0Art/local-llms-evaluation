package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPositionInvalidDeltaT {

    @Test
    public void calculateSolarPositionInvalidDeltaT() {
        ZonedDateTime date = ZoneOffset.ofHours(1).getRules().getStandardOffset(ZonedDateTime.now(), ZoneOffset.ofHours(12)).atStartOfDay();
        Optional<AzimuthZenithAngle> result = Grena3.calculateSolarPosition(date, 0.0, 0.0, Double.POSITIVE_INFINITY);
        assertTrue(result.isEmpty());
    }

}