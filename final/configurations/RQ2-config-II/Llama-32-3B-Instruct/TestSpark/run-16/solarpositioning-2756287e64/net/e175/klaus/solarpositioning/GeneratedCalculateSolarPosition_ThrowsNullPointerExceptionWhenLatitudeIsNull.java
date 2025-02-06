package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_ThrowsNullPointerExceptionWhenLatitudeIsNull {

    @Test
    public void calculateSolarPosition_ThrowsNullPointerExceptionWhenLatitudeIsNull() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, null, null, 0));
    }

}