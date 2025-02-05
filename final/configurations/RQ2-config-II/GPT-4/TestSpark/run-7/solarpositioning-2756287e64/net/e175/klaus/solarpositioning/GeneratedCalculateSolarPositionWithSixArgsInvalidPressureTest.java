package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedCalculateSolarPositionWithSixArgsInvalidPressureTest {

    @Test
    public void calculateSolarPositionWithSixArgsInvalidPressureTest() {
        ZonedDateTime date = ZonedDateTime.of(2021, 9, 20, 0, 0, 0, 0, ZoneId.of("Z"));
        double latitude = 20.0;
        double longitude = 30.0;
        double deltaT = 1.0;
        double pressure = -50.0;
        double temperature = 20.0;

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
    }

}