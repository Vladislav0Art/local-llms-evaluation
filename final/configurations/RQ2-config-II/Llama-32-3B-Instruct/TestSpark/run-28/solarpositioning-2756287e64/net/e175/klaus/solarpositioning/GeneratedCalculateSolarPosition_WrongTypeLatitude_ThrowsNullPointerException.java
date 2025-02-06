package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition_WrongTypeLatitude_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_WrongTypeLatitude_ThrowsNullPointerException() {
        ZonedDateTime date = ZoneOffset.ofHours(1).getRules().getBaseDate();
        double longitude = 0.0;
        double deltaT = 0.0;

        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, -0.5, longitude, deltaT));
    }

}