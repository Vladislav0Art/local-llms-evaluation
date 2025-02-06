package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import net.e175.klaus.solarpositioning.Grena3;

public class GeneratedCalculateSolarPosition ValidArguments_ReturnsCorrectResult {

    @Test
    public void calculateSolarPosition

    ValidArguments_ReturnsCorrectResult() {
        ZonedDateTime date = ZoneOffset.ofHours(1).getRules().getBaseDate();
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 0.0;
        double pressure = 1013.25;
        double temperature = 15.5;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, pressure, temperature);
        assertNotNull(result);
    }

}