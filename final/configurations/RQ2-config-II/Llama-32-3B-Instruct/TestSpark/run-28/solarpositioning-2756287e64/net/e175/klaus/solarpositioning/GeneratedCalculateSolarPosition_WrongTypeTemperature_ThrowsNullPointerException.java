package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition_WrongTypeTemperature_ThrowsNullPointerException {

    @Test
    public void calculateSolarPosition_WrongTypeTemperature_ThrowsNullPointerException() {
        ZonedDateTime date = ZoneOffset.ofHours(1).getRules().getBaseDate();
        double latitude = 0.0;
        double longitude = 0.0;
        double deltaT = 0.0;
        double pressure = 0.0;

        assertThrows(NullPointerException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, -0.5, -0.5));
    }

}