package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Optional;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPositionNoParameters {

    @Test
    public void calculateSolarPositionNoParameters() {
        Optional<AzimuthZenithAngle> result = Grena3.calculateSolarPosition(null, 0.0, 0.0, 0.0);
        assertTrue(result.isEmpty());
    }

}