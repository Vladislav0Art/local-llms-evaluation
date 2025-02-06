package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_ThrowsIllegalArgumentExceptionWhenLatitudeIsOutOfRange {

    @Test
    public void calculateSolarPosition_ThrowsIllegalArgumentExceptionWhenLatitudeIsOutOfRange() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = Double.MAX_VALUE;
        assertThrows(IllegalArgumentException.class, () -> Grena3.calculateSolarPosition(date, latitude, null, 0));
    }

}