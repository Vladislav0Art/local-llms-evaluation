package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition_WrongTypeDeltaT_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_WrongTypeDeltaT_ThrowsNullPointerException() {
        ZonedDateTime date = ZoneOffset.ofHours(1).getRules().getBaseDate();
        double latitude = 0.0;
        double longitude = 0.0;

        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, -0.5));
    }

}