package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.concurrent.atomic.AtomicDouble;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_NullDateThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_NullDateThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(null, 52.5200, 13.4052, 360.0));
    }

}